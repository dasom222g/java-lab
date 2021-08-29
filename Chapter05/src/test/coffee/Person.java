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
		System.out.println(name + "님은 " + cafeName + "에서 " + pay + "원짜리 커피를 사먹어서 남은 돈은" + money + " 원 입니다." );
	}
}
