package lamda.variabletype;

@FunctionalInterface
interface PrintString {
	public void showString(String text);
}

public class LamdaTest {
	public static void showMyString (PrintString printFn, String text) {
		printFn.showString(text);
	}
	
	public static PrintString getLamda() {
		return text -> System.out.println(text);
	}
	
	public static void main(String[] args) {
		// 변수대입
		PrintString lamdaString = text -> System.out.println(text);
		lamdaString.showString("변수 대입형 람다식");
		
		// 매개변수로 전달
		showMyString(text -> System.out.println(text), "매개변수형 람다식");
		
		// 반환값
		PrintString getLamda = getLamda();
		getLamda.showString("반환형 람다식");
		
	}
}
