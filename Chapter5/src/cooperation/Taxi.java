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
		System.out.println(carNumber + "번 택시의 승객 수 는 " + passengercount + " 이며 수익은 " + money + "입니다.");
	}
	
}
