package classExample;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass1 = String.class; //classŬ���� �������� ���1
		
		String str = new String();
		Class strClass2 = str.getClass(); //classŬ���� �������� ���2
		
		//classŬ���� �������� �������� ���
		Class strClass3 = Class.forName("java.lang.String");
		
		System.out.println(strClass1);
		System.out.println(strClass2);
		System.out.println(strClass3);
		
	}

}
