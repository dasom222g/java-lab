package abstractExample.templatePattern;

public class CarManual extends Car {

	@Override
	protected void driver() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("�극��ũ�� ��Ƽ� �����մϴ�.");
		
	}
	
}
