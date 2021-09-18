package decorator.test;

public class DecoratorLatte extends Decorator {

	public DecoratorLatte(Coffee coffee) {
		super(coffee);
	}

	@Override
	protected void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}
	
}
