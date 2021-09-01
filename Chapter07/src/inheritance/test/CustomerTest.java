package inheritance.test;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
//		String[] varNames = {"customerLee", "customerSin", "customerHong", "customerYul", "customerKim"};
//		String[] names = {"�̼���", "�Ż��Ӵ�", "ȫ�浿", "������", "������"};
		
		Customer customerLee = new Customer("�̼���");
		Customer customerSin = new Customer("�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer("ȫ�浿");
		Customer customerYul = new GoldCustomer("������");
		Customer customerKim = new VipCustomer("������", 12345);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerSin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("=========== �� ���� ��� ===========");
		for(Customer customer : customerList) {
			System.out.println(customer.getInfo());
		}
		
		System.out.println("=========== �������� ���ʽ� ����Ʈ ��� ===========");
		for(Customer customer : customerList) {
			int cost = customer.pay(10000);
			System.out.println(customer.getName() + "(" + customer.getGrade() + ")" + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.getBonusPoint() + "�� �Դϴ�.");
		}
	}

}
