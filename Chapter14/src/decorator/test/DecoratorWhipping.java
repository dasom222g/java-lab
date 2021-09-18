package decorator.test;

public class DecoratorWhipping extends Decorator {

	public DecoratorWhipping(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	protected void brewing() {
		super.brewing();
		System.out.print("Adding WhippingCream ");
	}

}
