package abstractExample.templatePattern.carTest;

public abstract class Car {
	protected abstract void start();
	protected abstract void drive();
	protected abstract void stop();
	protected abstract void turnOff();
	
	protected abstract String carType();
	
//	protected String startText = "�õ��� �մϴ�.";
//	protected String driveText = "�޸��ϴ�.";
//	protected String stopText = "����ϴ�.";
//	protected String turnOffText = "�õ��� ���ϴ�.";
	
	protected String startText() {
		return "�õ��� �մϴ�.";
	}
	protected String driveText() {
		return "�޸��ϴ�.";
	}
	protected String stopText() {
		return "����ϴ�.";
	}
	protected String turnOffText() {
		return "�õ��� ���ϴ�.";
	}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		System.out.println("�� ���� Ÿ����" + carType() + "�Դϴ�.");
	}
}
