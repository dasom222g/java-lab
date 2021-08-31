package inheritance.constructor;

public class CustomerTest {

	public static void main(String[] args) {
		int bonusPointLee = 1000;
		int bonusPointKim = 10000;
		
		Customer customerLee = new Customer("Lee", bonusPointLee);
		VipCustomer customerKim = new VipCustomer("Kim", bonusPointKim);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
