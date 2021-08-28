package test.card;

public class Card {
	// static����
	private static int serialNum = 1000;
	// �ν��Ͻ� ����
	private String customerName;
	private int cardNumber;	
	
	// ������
	Card(String customerName) {
		this.customerName = customerName;
		serialNum++;
		this.cardNumber = serialNum;
	}
	
	// ��� �޼ҵ�
	public void showCardInfo() {
		System.out.println("customerName: " + customerName + "cardNumber:" + cardNumber);
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}
