package bank.repositories;

import java.util.Collection;

import bank.entities.loan.Loan;

public class LoanRepository implements Repository {

	private Collection<Loan> loans;
	
	
	@Override
	public void addLoan(Loan loan) {
		loans.add(loan);
	}

	@Override
	public boolean removeLoan(Loan loan) {
		return loans.remove(loan);
	}

	@Override
	public Loan findFirst(String type) {
		return this.loans.stream().filter(s->type.equals(s.getClass().getSimpleName())).findFirst().orElse(null);
	}

}
