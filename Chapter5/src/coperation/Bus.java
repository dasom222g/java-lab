package coperation;

public class Bus {
	private int busNumber;
	private int passengercount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // ����
		this.passengercount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " �� ������ �°� �� �� " + passengercount + " �̸� ������ " + money + "�� �Դϴ�");
	}
}
