package abstractExample.templatePattern.carTest;

public class CarGrandeur extends Car {

	@Override
	protected void start() {
		System.out.println("Grandeur" + super.startText());
	}

	@Override
	protected void drive() {
		System.out.println("Grandeur" + super.driveText());
	}

	@Override
	protected void stop() {
		System.out.println("Grandeur" + super.stopText());
	}

	@Override
	protected void turnOff() {
		System.out.println("Grandeur" + super.turnOffText());
	}
	
	@Override
	protected String carType() {
		return "Grandeur";
	}

}
