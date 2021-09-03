package interfaceExample;

public class CalcTest {

	public static void main(String[] args) {
		Calc calculator = new CompleteCalc(); // 인터페이스에 정의된 메소드만 사용가능
		System.out.println(calculator.add(50, 0));
		System.out.println(calculator.divide(10, 0));
		
		CompleteCalc calculator2 = (CompleteCalc)calculator;
		calculator2.showInfo();
		
		// 디폴트 메소드 호출
		calculator.description();
		
		// static 메소드 호출
		int[] numArr = {1,2,3,4,5};
		int total = Calc.sum(numArr);
		System.out.println(total);
	}

}
