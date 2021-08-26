package test.coffee;

public class BuyingTest {

	public static void main(String[] args) {
		Person lee = new Person("Lee", 10000);
		Person kim = new Person("Kim", 10000);
		
		Cafe starbucks = new Cafe("스타벅스");
		Cafe tosomeplace = new Cafe("투썸플레이스") ;
		
		lee.buyCoffee(starbucks, Menu.STAR_AMERICANO);
		lee.buyCoffee(tosomeplace, Menu.TOSOME_LATTE);
		kim.buyCoffee(starbucks, Menu.STAR_LATTE);
		
		starbucks.showInfo();
		tosomeplace.showInfo();
	}

}
