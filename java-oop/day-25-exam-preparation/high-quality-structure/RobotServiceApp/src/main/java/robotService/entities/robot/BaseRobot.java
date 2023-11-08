package robotService.entities.robot;

import robotService.common.ExceptionMessages;

public abstract class BaseRobot implements Robot {

	private String name;
	private String kind;
	private int kilograms;
	private double price;

	


	protected BaseRobot(String name, String kind, int kilograms, double price) {
		this.setName(name);
		this.setKind(kind);
		this.setKilograms(kilograms);
		this.setPrice(price);
	}

	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new NullPointerException(ExceptionMessages.ROBOT_NAME_CANNOT_BE_NULL_OR_EMPTY);
		}
		this.name=name;
	}

	@Override
	public int getKilograms() {
		// TODO Auto-generated method stub
		return this.kilograms;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public abstract void eating();

	
	
	private String getKind() {
		return kind;
	}

	private void setKind(String kind) {
		if(kind==null || kind.trim().isEmpty()) {
			throw new NullPointerException(ExceptionMessages.ROBOT_KIND_CANNOT_BE_NULL_OR_EMPTY);
		}
		this.kind=kind;
	}

	protected void setKilograms(int kilograms) {
		this.kilograms = kilograms;
	}

	private void setPrice(double price) {
		if(price<=0) {
			throw new IllegalArgumentException(ExceptionMessages.ROBOT_PRICE_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
		}
		
		this.price = price;
	}

}
