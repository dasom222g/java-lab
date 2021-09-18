package decorator.test;

public class DecoratorMocha extends Decorator {

	public DecoratorMocha(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	protected void brewing() {
		super.brewing();
		System.out.print("Adding Mocha ");
	}

}
