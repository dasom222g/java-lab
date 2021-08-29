package test.coffee;

public class Cafe {
	private String cafeName;
	private int numberofSales;
	private int money;
	
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public String getCafeName() {
		return this.cafeName;
	}
	
	public void buy(String cafeName, int money) {
		numberofSales++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(this.cafeName + "은 " + numberofSales + "잔을 팔아 수익은" + money + "원 입니다.");
	}
	
}
