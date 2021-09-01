package inheritance.test;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
//		String[] varNames = {"customerLee", "customerSin", "customerHong", "customerYul", "customerKim"};
//		String[] names = {"이순신", "신사임당", "홍길동", "이율곡", "김유신"};
		
		Customer customerLee = new Customer("이순신");
		Customer customerSin = new Customer("신사임당");
		Customer customerHong = new GoldCustomer("홍길동");
		Customer customerYul = new GoldCustomer("이율곡");
		Customer customerKim = new VipCustomer("김유신", 12345);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerSin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("=========== 고객 정보 출력 ===========");
		for(Customer customer : customerList) {
			System.out.println(customer.getInfo());
		}
		
		System.out.println("=========== 할인율과 보너스 포인트 계산 ===========");
		for(Customer customer : customerList) {
			int cost = customer.pay(10000);
			System.out.println(customer.getName() + "(" + customer.getGrade() + ")" + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getName() + " 님의 현재 보너스 포인트는 " + customer.getBonusPoint() + "점 입니다.");
		}
	}

}
