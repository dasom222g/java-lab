package inheritance.overriding;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer goldLee = new Customer("Lee", 0);
		VipCustomer vipKim = new VipCustomer("Kim", 0);
		Customer vertualCustomer = new VipCustomer("vertual", 0);
		
		System.out.println("gold���� ���������ݾ�: " + goldLee.calcPrice(10000));
		System.out.println("vip���� ���������ݾ�: " + vipKim.calcPrice(10000));
		// ��ĳ���õ� �ν��Ͻ��� �������̵� �Լ�ȣ��
		System.out.println("������� ���������ݾ�: " + vertualCustomer.calcPrice(10000));
		
		System.out.println(goldLee.showCustomerInfo());
		System.out.println(vipKim.showCustomerInfo());
		System.out.println(vertualCustomer.showCustomerInfo());
		
	}

}
