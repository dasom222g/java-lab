package coperation;

public class Subway {
	private int lineNumber;
	private int passengercount;
	private int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // 승차
		this.passengercount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " 호선의 승객 수 는 " + passengercount + " 이며 수익은 " + money + "원 입니다");
	}
}
