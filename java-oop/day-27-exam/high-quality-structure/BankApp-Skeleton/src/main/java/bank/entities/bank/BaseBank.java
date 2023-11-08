package bank.entities.bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import bank.common.ExceptionMessages;
import bank.entities.client.Client;
import bank.entities.loan.Loan;

public abstract class BaseBank implements Bank {

	private String name;
	private int capacity;
	private Collection<Loan> loans;
	private Collection<Client> clients;
	
	
	protected BaseBank(String name, int capacity){
		this.name=name;
		this.capacity=capacity;
		this.loans=new ArrayList<>();
		this.clients=new ArrayList<>();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new IllegalArgumentException(ExceptionMessages.BANK_NAME_CANNOT_BE_NULL_OR_EMPTY);
		}
		
		this.name=name;
	}

	@Override
	public Collection<Client> getClients() {
		return Collections.unmodifiableCollection(this.clients);
	}

	@Override
	public Collection<Loan> getLoans() {
		return Collections.unmodifiableCollection(this.loans);
	}

	@Override
	public void addClient(Client client) {
		if(this.clients.size()>=this.capacity) {
			throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY_FOR_CLIENT);
		}
		
		this.clients.add(client);
	}

	@Override
	public void removeClient(Client client) {
		this.clients.remove(client);

	}

	@Override
	public void addLoan(Loan loan) {
		this.loans.add(loan);
	}

	@Override
	public int sumOfInterestRates() {
		return this.loans.stream().mapToInt(Loan::getInterestRate).sum();
	}

	@Override
	public String getStatistics() {
		
//		"Name: {bankName}, Type: {bankType}
//		Clients: {clientName1}, {clientName2} ... / Clients: none
//		Loans: {loansCount}, Sum of interest rates: {sumOfInterestRates}"\
		
		
		String template="Name: %s, Type: %s:\n"
		+"Clients: %s\n"
		+"Loans: %s ,"
		+"Sum of interest rates: %s\n";

		return String.format(template,
				this.getName(),
				this.getClass().getSimpleName(),
				this.getClients().isEmpty()? "none" : 
					this.getClients().stream().map(r->r.getName()).collect(Collectors.joining(", ")),
				this.getLoans().size(),
				this.sumOfInterestRates());
	}

}
