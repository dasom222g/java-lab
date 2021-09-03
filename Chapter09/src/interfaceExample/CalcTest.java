package interfaceExample;

public class CalcTest {

	public static void main(String[] args) {
		Calc calculator = new CompleteCalc(); // �������̽��� ���ǵ� �޼ҵ常 ��밡��
		System.out.println(calculator.add(50, 0));
		System.out.println(calculator.divide(10, 0));
		
		CompleteCalc calculator2 = (CompleteCalc)calculator;
		calculator2.showInfo();
		
		// ����Ʈ �޼ҵ� ȣ��
		calculator.description();
		
		// static �޼ҵ� ȣ��
		int[] numArr = {1,2,3,4,5};
		int total = Calc.sum(numArr);
		System.out.println(total);
	}

}
