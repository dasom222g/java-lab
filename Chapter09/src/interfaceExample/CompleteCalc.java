package interfaceExample;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println(ERROR);
			return ERRORNUM;
		}
		return num1 / num2;
	}
	
	// ���ο� �޼ҵ�
	public void showInfo() {
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
	// ����Ʈ �޼ҵ� ������
	@Override
	public void description() {
		super.description();
		System.out.println("CompletCalc Ŭ�������� ����Ǿ����ϴ�.");
	}
	
}
