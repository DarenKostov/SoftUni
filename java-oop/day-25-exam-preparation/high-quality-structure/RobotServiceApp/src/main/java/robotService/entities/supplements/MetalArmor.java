package robotService.entities.supplements;

public class MetalArmor extends BaseSupplement{
	private static final int DEFAULT_HARDNESS=5;
	private static final int DEFAULT_PRICE=15;

	public MetalArmor() {
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
