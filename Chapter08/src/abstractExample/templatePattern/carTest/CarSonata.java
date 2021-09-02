package abstractExample.templatePattern.carTest;

public class CarSonata extends Car {

	@Override
	protected void start() {
		System.out.println("Sonata" + super.startText());
	}

	@Override
	protected void drive() {
		System.out.println("Sonata" + super.driveText());
	}

	@Override
	protected void stop() {
		System.out.println("Sonata" + super.stopText());
	}

	@Override
	protected void turnOff() {
		System.out.println("Sonata" + super.turnOffText());
	}
	
	@Override
	protected String carType() {
		return "Sonata";
	}

}
