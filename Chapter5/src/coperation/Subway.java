package coperation;

public class Subway {
	private int lineNumber;
	private int passengercount;
	private int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // ����
		this.passengercount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " ȣ���� �°� �� �� " + passengercount + " �̸� ������ " + money + "�� �Դϴ�");
	}
}
