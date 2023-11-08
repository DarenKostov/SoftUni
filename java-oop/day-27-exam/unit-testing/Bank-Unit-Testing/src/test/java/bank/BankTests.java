package bank;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;



public class BankTests {
	
	
	private final static String BANK_NAME="tiuvrgntehwemokdwiodhxemi";
	private final static int BANK_CAPACITY=10;
	private final static String CLIENT_NAME=">>TheClientName<<";

	private Bank bank;
	private Client client;

	@Before
	public void setUpBankAndClient() {
		bank= new Bank(BANK_NAME, BANK_CAPACITY);
		client= new Client(CLIENT_NAME);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testSetNameNullShouldThrow() {
		new Bank(null, 23);
	}
	@Test(expected = NullPointerException.class)
	public void testSetNameWhiteSpaceShouldThrow() {
		new Bank("   ", 23);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCapacityShouldThrowOnNegative() {
		new Bank("myBank", -99);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testBankIsFullShouldThrow() {
		Bank bank=new Bank("theBank", 0);
		bank.addClient(new Client("client1"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWithdrawalShouldThrowOnMissingClient() {
		Bank bank=new Bank("theBank", 2);
		bank.loanWithdrawal("ImaginaryClient");
	}
	
	@Test
	public void testClientWithWithdrawal() {
		bank.addClient(client);
		Assert.assertEquals(bank.loanWithdrawal(CLIENT_NAME), client);
	}
	
	@Test
	public void testCountAfterRemove() {
		bank.addClient(client);
		bank.removeClient(CLIENT_NAME);
		Assert.assertEquals(bank.getCount(), 0);

	}
	
	@Test
	public void testCountAfterAdd() {
		for(int i=0; i<10; i++) {
			bank.addClient(client);
		}
		
		Assert.assertEquals(bank.getCount(), 10);
	}
	
	
	@Test
	public void testStatistics() {
		bank.addClient(client);
		bank.addClient(new Client("Ivan"));
		bank.addClient(new Client("Gogo"));
		bank.addClient(new Client("Mimi"));
		Assert.assertEquals(bank.statistics(), "The client >>TheClientName<<, Ivan, Gogo, Mimi is at the "+BANK_NAME+" bank!");
	}
	
	
	@Test
	public void testWithdrawalRemovalOfLoanApproval() {
		bank.addClient(client);
		Assert.assertFalse(bank.loanWithdrawal(CLIENT_NAME).isApprovedForLoan());
	}
	
	@Test
	public void testSetGetName() {
		Assert.assertEquals(bank.getName(), BANK_NAME);
	}
	
	@Test
	public void testSetGetCapacity() {
		Assert.assertEquals(bank.getCapacity(), BANK_CAPACITY);
	}
	
	@Test
	public void testSetClientNameWithClientName() {
		bank.addClient(client);
		Assert.assertEquals(bank.loanWithdrawal(CLIENT_NAME).getName(), CLIENT_NAME);
	}
	
	@Test
	public void TestSetClientName() {
		Assert.assertEquals(client.getName(), CLIENT_NAME);
	}
	
	@Test
	public void TestClientApprovedForLoanGet() {
		Assert.assertTrue(client.isApprovedForLoan());
	}
	
	@Test
	public void TestClientApprovedForLoanSet() {
		client.setApprovedForLoan(false);
		Assert.assertFalse(client.isApprovedForLoan());
	}
	
	@Test
	public void testCountAfterAddAndRemove() {
		for(int i=0; i<10; i++) {
			bank.addClient(new Client("Client"+i));
		}
		for(int i=0; i<10; i++) {
			bank.removeClient("Client"+i);
		}
		Assert.assertEquals(bank.getCount(), 0);
	}
	
	@Test
	public void testMultipleWithdrawals() {
		for(int i=0; i<10; i++) {
			bank.addClient(new Client("Client"+i));
		}
		
		for(int i=0; i<10; i++) {
			Assert.assertFalse(bank.loanWithdrawal("Client"+i).isApprovedForLoan());
		}
	}
	
	
	@Test
	public void testStatisticsWithNoClients() {
		Assert.assertEquals(bank.statistics(), "The client  is at the "+BANK_NAME+" bank!");
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullClient() {
		bank.addClient(null);
		bank.statistics();
	}
	
	@Test
	public void testLoanApproval() {
		bank.addClient(client);
		bank.loanWithdrawal(CLIENT_NAME);
		Assert.assertFalse(client.isApprovedForLoan());
		client.setApprovedForLoan(true);
		Assert.assertTrue(client.isApprovedForLoan());
	}

	@Test
	public void testStatisticsAfterRemoval() {
		bank.addClient(client);
		bank.addClient(new Client("Ivan"));
		bank.addClient(new Client("Gogo"));
		bank.addClient(new Client("Mimi"));
		
		bank.removeClient("Gogo");
		
		Assert.assertEquals(bank.statistics(), "The client >>TheClientName<<, Ivan, Mimi is at the "+BANK_NAME+" bank!");
	}
		
	
}
