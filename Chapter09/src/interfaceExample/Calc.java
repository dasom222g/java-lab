package interfaceExample;

public interface Calc {
	double PI = 3.14; // public static final PI = 3.14'
	String ERROR = "에러입니다";
	int ERRORNUM = -9999999;

	public int add(int num1, int num2);
	public int substract(int num1, int num2); // 빼기
	public int times(int num1, int num2); // 곱하기
	public int divide(int num1, int num2);
	
	// 디폴트 메소드
	public default void description() {
		secretMethod();
		System.out.println("Calc 인터페이스에서 실행되었씁니다.");
	}
	// 정적 메소드
	public static int sum(int[] numList) {
		int result = 0;
		for(int num : numList) {
			result += num;
		}
		secretStaticMethod();
		return result;
	}
	// private메소드
	private void secretMethod() {
		System.out.println("private메소드 입니다.");
	}
	private static void secretStaticMethod() {
		System.out.println("static private메소드 입니다.");
	}
}
