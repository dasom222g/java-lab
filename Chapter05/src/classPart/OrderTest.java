package classPart;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderId = 201907210001L;
		order.customerId = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.customerName = "홍길순";
		order.productId = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrder();
	}

}
