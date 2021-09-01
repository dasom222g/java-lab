package inheritance.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer silverKim = new Customer("Kim", 0);
		Customer goldLee = new GoldCustomer("Lee", 0);
		
		int payKim =  silverKim.calcPrice(10000); // ���� ����
		int payLee =  goldLee.calcPrice(10000); // ���� ����
		
		System.out.println(silverKim.showCustomerInfo());
		System.out.println(silverKim.getCustomerName() + "���� �� �����ݾ��� " + payKim + "�Դϴ�");
		
		System.out.println(goldLee.showCustomerInfo());
		System.out.println(goldLee.getCustomerName() + "���� �� �����ݾ��� " + payLee + "�Դϴ�");
	}

}
