package robotService.entities.supplements;

public class PlasticArmor extends BaseSupplement{

	private static final int DEFAULT_HARDNESS=1;
	private static final int DEFAULT_PRICE=10;

	public PlasticArmor() {
		super(DEFAULT_HARDNESS, DEFAULT_PRICE);
	}

	@Override
	public int getHardness() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
