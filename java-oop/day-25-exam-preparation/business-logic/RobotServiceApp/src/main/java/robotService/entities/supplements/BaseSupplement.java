package robotService.entities.supplements;

public abstract class BaseSupplement implements Supplement{
	
	protected int hardness;
	protected double price;
	
	protected BaseSupplement(int hardness, double price){
		this.hardness=hardness;
		this.price=price;
		
		
	}
	
	
}
