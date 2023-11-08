package bank.entities.bank;

import bank.entities.client.Client;
import bank.entities.client.Student;

public class BranchBank extends BaseBank {

	private final static int DEFAULT_CAPACITY=25;
	
	public BranchBank(String name) {
		super(name, DEFAULT_CAPACITY);
	}
	
	@Override
	public void addClient(Client client) {
		if(client instanceof Student) {
			super.addClient(client);
			return;
		}
		throw new IllegalArgumentException();
	}
}
