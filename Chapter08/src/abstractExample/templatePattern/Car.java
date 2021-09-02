package abstractExample.templatePattern;

public abstract class Car {
	// 추상 메소드
	protected abstract void driver();
	protected abstract void stop();
	
	// hook메소드
	protected void wash() {};
	// 일반 메소드
	protected void startCar() {
		System.out.println("시동을 켭니다");
	}
	protected void trunOff() {
		System.out.println("시동을 끕니다");
	}
	
	public final void run() {
		startCar();
		driver();
		stop();
		trunOff();
		wash();
	}
}
