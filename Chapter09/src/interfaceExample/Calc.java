package interfaceExample;

public interface Calc {
	double PI = 3.14; // public static final PI = 3.14'
	String ERROR = "�����Դϴ�";
	int ERRORNUM = -9999999;

	public int add(int num1, int num2);
	public int substract(int num1, int num2); // ����
	public int times(int num1, int num2); // ���ϱ�
	public int divide(int num1, int num2);
	
	// ����Ʈ �޼ҵ�
	public default void description() {
		secretMethod();
		System.out.println("Calc �������̽����� ����Ǿ����ϴ�.");
	}
	// ���� �޼ҵ�
	public static int sum(int[] numList) {
		int result = 0;
		for(int num : numList) {
			result += num;
		}
		secretStaticMethod();
		return result;
	}
	// private�޼ҵ�
	private void secretMethod() {
		System.out.println("private�޼ҵ� �Դϴ�.");
	}
	private static void secretStaticMethod() {
		System.out.println("static private�޼ҵ� �Դϴ�.");
	}
}
