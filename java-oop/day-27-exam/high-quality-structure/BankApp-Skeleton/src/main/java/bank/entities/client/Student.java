package bank.entities.client;

public class Student extends BaseClient {

	private static final int INITIAL_INTEREST=2;
	
	
	protected Student(String name, String ID, double income) {
		super(name, ID, INITIAL_INTEREST, income);
	}

	@Override
	public void increase() {
		super.increase();
	}
	
	
}
