package abstractExample.templatePattern;

public class CarAI extends Car {

	@Override
	protected void driver() {
		System.out.println("�������� �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("������ ����ϴ�.");
		
	}

	@Override
	protected void wash() {
		System.out.println("������������ ������ �����մϴ�.");
	}

}
