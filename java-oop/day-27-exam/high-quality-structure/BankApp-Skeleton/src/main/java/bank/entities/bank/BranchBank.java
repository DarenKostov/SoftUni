package bank.entities.bank;

public class BranchBank extends BaseBank {

	private final static int DEFAULT_CAPACITY=25;
	
	public BranchBank(String name) {
		super(name, DEFAULT_CAPACITY);
	}
	
}
