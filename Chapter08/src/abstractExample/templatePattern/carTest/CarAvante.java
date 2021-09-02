package abstractExample.templatePattern.carTest;

public class CarAvante extends Car {

	@Override
	protected void start() {
		System.out.println("Avante" + super.startText());
	}

	@Override
	protected void drive() {
		System.out.println("Avante" + super.driveText());
	}

	@Override
	protected void stop() {
		System.out.println("Avante" + super.stopText());
	}

	@Override
	protected void turnOff() {
		System.out.println("Avante" + super.turnOffText());
	}
	
	@Override
	protected String carType() {
		return "Avante";
	}

}
