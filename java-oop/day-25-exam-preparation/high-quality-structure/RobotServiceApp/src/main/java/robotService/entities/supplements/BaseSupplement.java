package robotService.entities.supplements;

public abstract class BaseSupplement implements Supplement{
	
	private int hardness;
	private double price;
	
	protected BaseSupplement(int hardness, double price){
		this.hardness=hardness;
		this.price=price;
		
		
	}
	
	
}