package classPart;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderId = 201907210001L;
		order.customerId = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.customerName = "ȫ���";
		order.productId = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		order.showOrder();
	}

}
