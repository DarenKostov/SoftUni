package bank.core;

import java.util.ArrayList;
import java.util.Collection;

import bank.entities.bank.Bank;
import bank.entities.bank.BranchBank;
import bank.entities.bank.CentralBank;
import bank.entities.client.Adult;
import bank.entities.client.Client;
import bank.entities.client.Student;
import bank.entities.loan.Loan;
import bank.entities.loan.MortgageLoan;
import bank.entities.loan.StudentLoan;
import bank.repositories.LoanRepository;
import bank.common.ConstantMessages;
import bank.common.ExceptionMessages;


public class ControllerImpl implements Controller {

	
	
	private LoanRepository loans;
	private Collection<Bank> banks;
	
	public ControllerImpl() {
		loans=new LoanRepository();
		banks=new ArrayList<>();
		
	}
	
	@Override
	public String addBank(String type, String name) {
		
		if(type.equals("CentralBank")) {
			this.banks.add(new CentralBank(name));
			return "CentralBank is successfully added.";
		}else if(type.equals("BranchBank")) {
			this.banks.add(new BranchBank(name));
			return "BranchBank is successfully added.";
		}
		
		throw new NullPointerException(ExceptionMessages.INVALID_BANK_TYPE);

	}

	@Override
	public String addLoan(String type) {
		
		if(type.equals("StudentLoan")) {
			this.loans.addLoan(new StudentLoan());
			return "StudentLoan is successfully added.";
		}else if(type.equals("MortgageLoan")) {
			this.loans.addLoan(new MortgageLoan());
			return "MortgageLoan is successfully added.";
		}
		
		throw new NullPointerException(ExceptionMessages.INVALID_LOAN_TYPE);
	}

	@Override
	public String returnedLoan(String bankName, String loanType) {
		
		Loan loan=loans.findFirst(loanType);
		
		Bank bank=this.getBank(bankName);
		
		
		if(loan==null) {
			throw new IllegalArgumentException(String.format(ExceptionMessages.NO_LOAN_FOUND, loanType));
		}
		
		
		bank.addLoan(loan);
		loans.removeLoan(loan);
		
		return String.format(ConstantMessages.SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK,loanType, bankName);
	}

	@Override
	public String addClient(String bankName, String clientType, String clientName, String clientID, double income) {
		
		Bank bank=getBank(bankName);
		Client client=null;
		
		if(clientType.equals("Student")) {
			client=new Student(clientName, clientID, income);
		}else if(clientType.equals("Adult")) {
			client=new Adult(clientName, clientID, income);
		}else {
			throw new IllegalArgumentException(ExceptionMessages.INVALID_CLIENT_TYPE);
		}
		
		try {
			bank.addClient(client);
		} catch (IllegalArgumentException e) {
			return ConstantMessages.UNSUITABLE_BANK;
		}
		
		return String.format(ConstantMessages.SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK, clientType, bankName);
		
		
	}

	@Override
	public String finalCalculation(String bankName) {
		
		
		Bank bank=this.getBank(bankName);

		double clientsIncome=bank.getClients().stream().mapToDouble(Client::getIncome).sum();
		double sLoansAmount=bank.getLoans().stream().mapToDouble(Loan::getAmount).sum();

		
		return String.format(ConstantMessages.FUNDS_BANK, bankName, clientsIncome+sLoansAmount);
	}

	@Override
	public String getStatistics() {
		
		StringBuilder sb= new StringBuilder();
		
		this.banks.forEach(s->{
			sb.append(s.getStatistics());
			sb.append("\n");
		});
		
		return sb.toString().trim();
	}
	
	
	private Bank getBank(String bankName) {
		return banks.stream().filter(s-> s.getName().equals(bankName)).findFirst().orElse(null);
	}
}
