package abstractExample.templatePattern;

public class CarAI extends Car {

	@Override
	protected void driver() {
		System.out.println("자율주행 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	protected void stop() {
		System.out.println("스스로 멈춥니다.");
		
	}

	@Override
	protected void wash() {
		System.out.println("자율주행차는 스스로 세차합니다.");
	}

}
