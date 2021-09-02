package abstractExample.templatePattern.carTest;

public abstract class Car {
	protected abstract void start();
	protected abstract void drive();
	protected abstract void stop();
	protected abstract void turnOff();
	
	protected abstract String carType();
	
//	protected String startText = "시동을 켭니다.";
//	protected String driveText = "달립니다.";
//	protected String stopText = "멈춥니다.";
//	protected String turnOffText = "시동을 끕니다.";
	
	protected String startText() {
		return "시동을 켭니다.";
	}
	protected String driveText() {
		return "달립니다.";
	}
	protected String stopText() {
		return "멈춥니다.";
	}
	protected String turnOffText() {
		return "시동을 끕니다.";
	}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		System.out.println("이 차의 타입은" + carType() + "입니다.");
	}
}
