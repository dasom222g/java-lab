package classPart;

public class Order {
	public long orderId;
	public String customerId;
	public String orderDate;
	public String customerName;
	public String productId;
	public String address;

	public void showOrder() {
		System.out.println("주문 번호: " + orderId);
		System.out.println("주문자 아이디: " + customerId);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + customerName);
		System.out.println("주문 상품 번호: " + productId);
		System.out.println("배송 주소: " + address);
		
	}
}                 