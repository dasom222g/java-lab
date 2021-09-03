package interfaceExample.multipleImplements;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order(); // 중복되는 디폴트 메소드
	}

}
