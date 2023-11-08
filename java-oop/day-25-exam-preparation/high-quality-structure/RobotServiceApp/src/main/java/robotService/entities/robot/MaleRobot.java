package robotService.entities.robot;

public class MaleRobot extends BaseRobot {
	
	private static final int DEFAULT_KILOGRAMS=9;
	private static final int KILOGRAM_INCREASE_FACTOR=3;

	protected MaleRobot(String name, String kind, double price) {
		super(name, kind, DEFAULT_KILOGRAMS, price);
	}
	@Override
	public void eating() {
		setKilograms(getKilograms()+KILOGRAM_INCREASE_FACTOR);
	} 

}
