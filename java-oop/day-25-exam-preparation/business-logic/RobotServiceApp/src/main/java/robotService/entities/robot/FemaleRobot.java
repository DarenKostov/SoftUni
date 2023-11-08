package robotService.entities.robot;

public class FemaleRobot extends BaseRobot {

	private static final int DEFAULT_KILOGRAMS=7;
	private static final int KILOGRAM_INCREASE_FACTOR=1;

	public FemaleRobot(String name, String kind, double price) {
		super(name, kind, DEFAULT_KILOGRAMS, price);
	}
	@Override
	public void eating() {
		setKilograms(getKilograms()+KILOGRAM_INCREASE_FACTOR);
	}
}
