package inheritance.overriding;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer goldLee = new Customer("Lee", 0);
		VipCustomer vipKim = new VipCustomer("Kim", 0);
		Customer vertualCustomer = new VipCustomer("vertual", 0);
		
		System.out.println("gold고객의 최종결제금액: " + goldLee.calcPrice(10000));
		System.out.println("vip고객의 최종결제금액: " + vipKim.calcPrice(10000));
		// 업캐스팅된 인스턴스의 오버라이딩 함수호출
		System.out.println("가상고객의 최종결제금액: " + vertualCustomer.calcPrice(10000));
		
		System.out.println(goldLee.showCustomerInfo());
		System.out.println(vipKim.showCustomerInfo());
		System.out.println(vertualCustomer.showCustomerInfo());
		
	}

}
