package classPart;

public class FunctionTest {
	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {

//		FunctionTest addFn = new FunctionTest();
		// static�޼ҵ�� ������ ���� �ٷ� ��밡�� (�Ʒ� 2��� ���� �ٷ� ���)
//		int result = FunctionTest.addNum(5, 70);
		int result = addNum(5, 70);
		System.out.println("result " + result);
	}

}
