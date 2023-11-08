package robots;

import org.junit.Test;

public class ServiceTests {

	@Test(expected = NullPointerException.class)
	public void testSetNameShouldThrow() {
		new Service(null, 22);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testSetNameShouldThrowWhiteSpace() {
		new Service("   ", 22);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCapacityShouldThrowOnNegative() {
		new Service("aaaa", -3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddingBeyondCapacity() {
		Service service= new Service("blahBlah", 1);
		service.add(new Robot("robot1"));
		service.add(new Robot("robot2"));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testRemoveShouldThrowOnMissingRobot() {
		Service service= new Service("blahBlah", 32);
		service.remove("who");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testForSaleShouldThrowOnMissingRobot() {
		Service service= new Service("blahBlah", 32);
		service.forSale("who");
	}
	
}
