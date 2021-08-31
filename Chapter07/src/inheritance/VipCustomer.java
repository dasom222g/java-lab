package inheritance;

public class VipCustomer extends Customer {
//	private int agentID;
	double salesRatio;
	
	public VipCustomer() {
		System.out.println("하위클래스(VipCustomer) 생성");
		// 상위 클래스 멤버변수
		customerGrade = "VIP";
		bonusRatio = 0.05;
		// 해당 클래스 멤버변수
		salesRatio = 0.1;
	}
}
