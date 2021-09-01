package inheritance.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer silverKim = new Customer("Kim", 0);
		Customer goldLee = new GoldCustomer("Lee", 0);
		
		int payKim =  silverKim.calcPrice(10000); // 만원 결제
		int payLee =  goldLee.calcPrice(10000); // 만원 결제
		
		System.out.println(silverKim.showCustomerInfo());
		System.out.println(silverKim.getCustomerName() + "님의 실 결제금액은 " + payKim + "입니다");
		
		System.out.println(goldLee.showCustomerInfo());
		System.out.println(goldLee.getCustomerName() + "님의 실 결제금액은 " + payLee + "입니다");
	}

}
