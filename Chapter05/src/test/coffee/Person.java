package test.coffee;

public class Person {
	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(Cafe cafe, int pay) {
		cafe.buy(cafe.getCafeName(), pay);
		this.money -= pay;
		this.showInfo(cafe.getCafeName(), pay);
	}
	
	public void showInfo(String cafeName, int pay) {
		System.out.println(name + "���� " + cafeName + "���� " + pay + "��¥�� Ŀ�Ǹ� ��Ծ ���� ����" + money + " �� �Դϴ�." );
	}
}
