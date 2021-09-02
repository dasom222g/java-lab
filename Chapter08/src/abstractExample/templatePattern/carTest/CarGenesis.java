package abstractExample.templatePattern.carTest;

public class CarGenesis extends Car {

	@Override
	protected void start() {
		System.out.println("Genesis" + super.startText());
	}

	@Override
	protected void drive() {
		System.out.println("Genesis" + super.driveText());
	}

	@Override
	protected void stop() {
		System.out.println("Genesis" + super.stopText());
	}

	@Override
	protected void turnOff() {
		System.out.println("Genesis" + super.turnOffText());
	}
	
	@Override
	protected String carType() {
		return "Genesis";
	}

}
