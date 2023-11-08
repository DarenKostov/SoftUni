package bank.entities.bank;

import bank.entities.client.Adult;
import bank.entities.client.Client;

public class CentralBank extends BaseBank {
	
	private final static int DEFAULT_CAPACITY=50;
	
	public CentralBank(String name) {
		super(name, DEFAULT_CAPACITY);
	}
	
	@Override
	public void addClient(Client client) {
		if(client instanceof Adult) {
			super.addClient(client);
			return;
		}
		throw new IllegalArgumentException();
	}
	
}
