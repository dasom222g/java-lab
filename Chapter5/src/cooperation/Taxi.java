package cooperation;

public class Taxi {
	private int carNumber;
	private int passengercount;
	private int money;
	
	public Taxi(int carNumber) {
		this.carNumber = carNumber;
	}
	
	public void take(int money) {
		this.passengercount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(carNumber + "�� �ý��� �°� �� �� " + passengercount + " �̸� ������ " + money + "�Դϴ�.");
	}
	
}
