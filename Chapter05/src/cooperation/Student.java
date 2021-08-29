package cooperation;

public class Student {
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // ��ü�� ���ºκ� (��ü�� �Ű������� �޾ƿ� �ش簴ü�� �޼ҵ带 Ȱ��)
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
		System.out.println(name + "���� ���� �ݾ��� " + money +" �� �Դϴ�.");
	}
}
