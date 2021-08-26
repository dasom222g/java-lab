package test.coffee;

public class BuyingTest {

	public static void main(String[] args) {
		Person lee = new Person("Lee", 10000);
		Person kim = new Person("Kim", 10000);
		
		Cafe starbucks = new Cafe("��Ÿ����");
		Cafe tosomeplace = new Cafe("�����÷��̽�") ;
		
		lee.buyCoffee(starbucks, Menu.STAR_AMERICANO);
		lee.buyCoffee(tosomeplace, Menu.TOSOME_LATTE);
		kim.buyCoffee(starbucks, Menu.STAR_LATTE);
		
		starbucks.showInfo();
		tosomeplace.showInfo();
	}

}
