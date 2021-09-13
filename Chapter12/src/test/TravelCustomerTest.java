package test;

import java.util.ArrayList;

public class TravelCustomerTest {

	public static void main(String[] args) {
		ArrayList<TravelCustomer> customerList = new ArrayList<>();
		TravelCustomer lee = new TravelCustomer("이순신", 40);
		TravelCustomer kim = new TravelCustomer("김유신", 20);
		TravelCustomer hong = new TravelCustomer("홍길동", 13);
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		
		System.out.println(customerList);
		
		// 고객 명단 출력
		customerList.stream().forEach(item -> System.out.println(item.getName()));
		
		// 여행의 총비용 출력
//		int totalPrice = customerList.stream()
//							.map(item -> item.getPrice())
//							.reduce(0, (a, b) -> a + b);
		int totalPrice = customerList.stream()
							.mapToInt(item -> item.getPrice()).sum();
		System.out.println(totalPrice);
		
		// 20세 이상인 고객의 이름을 오름차순으로 정렬하여 출령
		customerList.stream()
			.filter(item -> item.getAge() >= 20)
			.map(item -> item.getName())
			.sorted().forEach(item -> System.out.println(item));
	}

}
