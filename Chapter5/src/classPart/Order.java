package classPart;

public class Order {
	public long orderId;
	public String customerId;
	public String orderDate;
	public String customerName;
	public String productId;
	public String address;

	public void showOrder() {
		System.out.println("�ֹ� ��ȣ: " + orderId);
		System.out.println("�ֹ��� ���̵�: " + customerId);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ��� �̸�: " + customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + productId);
		System.out.println("��� �ּ�: " + address);
		
	}
}                 