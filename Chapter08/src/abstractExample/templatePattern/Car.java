package abstractExample.templatePattern;

public abstract class Car {
	// �߻� �޼ҵ�
	protected abstract void driver();
	protected abstract void stop();
	
	// hook�޼ҵ�
	protected void wash() {};
	// �Ϲ� �޼ҵ�
	protected void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	protected void trunOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public final void run() {
		startCar();
		driver();
		stop();
		trunOff();
		wash();
	}
}
