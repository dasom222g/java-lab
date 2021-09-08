package classExample;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass1 = String.class; //class클래스 가져오는 방법1
		
		String str = new String();
		Class strClass2 = str.getClass(); //class클래스 가져오는 방법2
		
		//class클래스 동적으로 가져오는 방법
		Class strClass3 = Class.forName("java.lang.String");
		
		System.out.println(strClass1);
		System.out.println(strClass2);
		System.out.println(strClass3);
		
	}

}
