package inheritance.overriding;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer silverLee = new Customer("Lee", 0);
		VipCustomer vipKim = new VipCustomer("Kim", 0);
		Customer vertualCustomer = new VipCustomer("vertual", 0);
		
		System.out.println("silver���� ���������ݾ�: " + silverLee.calcPrice(10000));
		System.out.println("vip���� ���������ݾ�: " + vipKim.calcPrice(10000));
		// ��ĳ���õ� �ν��Ͻ��� �������̵� �Լ�ȣ��
		System.out.println("������� ���������ݾ�: " + vertualCustomer.calcPrice(10000));
		
		System.out.println(silverLee.showCustomerInfo());
		System.out.println(vipKim.showCustomerInfo());
		System.out.println(vertualCustomer.showCustomerInfo());
		
	}

}
