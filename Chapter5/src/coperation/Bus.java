package coperation;

public class Bus {
	private int busNumber;
	private int passengercount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // 승차
		this.passengercount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " 번 버스의 승객 수 는 " + passengercount + " 이며 수익은 " + money + "원 입니다");
	}
}
