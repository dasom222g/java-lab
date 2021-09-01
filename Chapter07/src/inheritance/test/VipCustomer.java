package inheritance.test;

public class VipCustomer extends Customer {
	private int agentID;
	private double salesRatio;
	
	VipCustomer(String customerName, int agentID) {
		super(customerName);
		this.agentID = agentID;
	}
	
	@Override
	protected void setGrade() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.2; 
	}
	@Override
	public int pay(int price) {
		super.pay(price);
		return (int)(price - price * salesRatio);
	}
	@Override
	public String getInfo() {
		return super.getInfo() + "담당상담원 번호는 " + agentID + "입니다";
	}
}
