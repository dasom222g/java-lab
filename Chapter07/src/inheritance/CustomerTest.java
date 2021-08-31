package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("Lee");
		customerLee.setCustomerId(1001);
		customerLee.setBonusPoint(1000);
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerName("Kim");
		customerKim.setCustomerId(1002);
		customerKim.setBonusPoint(10000);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}

}
