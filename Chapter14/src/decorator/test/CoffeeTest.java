package decorator.test;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee espresso = new KenyaEspresso(); // ���� Ŭ����
		espresso.brewing();
		System.out.println();
		
		// ���� Ŭ����
		Coffee latte = new DecoratorLatte(new KenyaEspresso());
		latte.brewing();
		System.out.println();
		
		Coffee mochaLatte = new DecoratorMocha(new DecoratorLatte(new KenyaEspresso()));
		mochaLatte.brewing();
		System.out.println();
		
		Coffee whippingMochaLatte = new DecoratorWhipping(new DecoratorMocha(new DecoratorLatte(new KenyaEspresso())));
		whippingMochaLatte.brewing();
	}

}
