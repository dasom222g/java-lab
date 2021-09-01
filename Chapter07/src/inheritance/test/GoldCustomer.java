package inheritance.test;

public class GoldCustomer extends Customer {
	private double salesRatio;

	public GoldCustomer(String customerName) {
		super(customerName);
	}
	
	@Override
	protected void setGrade() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	@Override
	public int pay(int price) {
		super.pay(price);
		return (int)(price - price * salesRatio);
	}

}
