package decorator.test;

// ���� Ŭ������ �ֻ��� Ŭ����
// �� Ŭ������ �������� �ʰ� ����Ŭ������ ���Ǹ� ���Ѱ��̹Ƿ� abstract Ű����� ������ ������
public abstract class Decorator extends Coffee {
	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		// ��� Ŭ���� �޾ƿ�
		this.coffee = coffee;
	}

	@Override
	protected void brewing() {
		this.coffee.brewing();
	}

}
