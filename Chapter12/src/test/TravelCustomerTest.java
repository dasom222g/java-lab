package test;

import java.util.ArrayList;

public class TravelCustomerTest {

	public static void main(String[] args) {
		ArrayList<TravelCustomer> customerList = new ArrayList<>();
		TravelCustomer lee = new TravelCustomer("�̼���", 40);
		TravelCustomer kim = new TravelCustomer("������", 20);
		TravelCustomer hong = new TravelCustomer("ȫ�浿", 13);
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		
		System.out.println(customerList);
		
		// �� ��� ���
		customerList.stream().forEach(item -> System.out.println(item.getName()));
		
		// ������ �Ѻ�� ���
//		int totalPrice = customerList.stream()
//							.map(item -> item.getPrice())
//							.reduce(0, (a, b) -> a + b);
		int totalPrice = customerList.stream()
							.mapToInt(item -> item.getPrice()).sum();
		System.out.println(totalPrice);
		
		// 20�� �̻��� ���� �̸��� ������������ �����Ͽ� ���
		customerList.stream()
			.filter(item -> item.getAge() >= 20)
			.map(item -> item.getName())
			.sorted().forEach(item -> System.out.println(item));
	}

}
