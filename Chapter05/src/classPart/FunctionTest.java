package classPart;

public class FunctionTest {
	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {

//		FunctionTest addFn = new FunctionTest();
		// static메소드는 생성자 없이 바로 사용가능 (아래 2경우 같이 바로 사용)
//		int result = FunctionTest.addNum(5, 70);
		int result = addNum(5, 70);
		System.out.println("result " + result);
	}

}
