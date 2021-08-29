package cooperation;

public class Student {
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 객체의 협력부분 (객체를 매개변수로 받아와 해당객체의 메소드를 활용)
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi, int money) {
		taxi.take(money);
		this.money -= money;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 금액은 " + money +" 원 입니다.");
	}
}
