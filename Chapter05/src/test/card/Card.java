package test.card;

public class Card {
	// static변수
	private static int serialNum = 1000;
	// 인스턴스 변수
	private String customerName;
	private int cardNumber;	
	
	// 생성자
	Card(String customerName) {
		this.customerName = customerName;
		serialNum++;
		this.cardNumber = serialNum;
	}
	
	// 멤버 메소드
	public void showCardInfo() {
		System.out.println("customerName: " + customerName + "cardNumber:" + cardNumber);
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}
