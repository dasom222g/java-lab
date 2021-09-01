package inheritance.polymorphism;

public class VipCustomer extends Customer {
	private double salesRatio;
	
	public VipCustomer(String cusomerName, int bonusPoint) {
		super(cusomerName, bonusPoint); // 매개변수 있는 부모생성자 호출
		// 상위 클래스 멤버변수
		customerGrade = "VIP";
		bonusRatio = 0.05;
		// 해당 클래스 멤버변수
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price - (int)(price * salesRatio);
	}
}
