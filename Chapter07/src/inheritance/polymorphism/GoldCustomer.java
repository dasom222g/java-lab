package inheritance.polymorphism;

public class GoldCustomer extends Customer {
	private double salesRatio;
	
	public GoldCustomer(String cusomerName, int bonusPoint) {
		super(cusomerName, bonusPoint);
		bonusRatio = 0.02;
		salesRatio = 0.05;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	
}
