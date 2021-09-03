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
	
	// 새로운 메소드
	public void showInfo() {
		System.out.println("계산이 완료되었습니다.");
	}
	// 디폴트 메소드 재정의
	@Override
	public void description() {
		super.description();
		System.out.println("CompletCalc 클래스에서 실행되었씁니다.");
	}
	
}
