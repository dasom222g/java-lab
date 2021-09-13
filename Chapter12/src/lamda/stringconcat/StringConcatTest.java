package lamda.stringconcat;

public class StringConcatTest {

	public static void main(String[] args) {
		// 객체 지향식
		StringConcatSub concatSub = new StringConcatSub();
		concatSub.makeString("Hello", "World");
		
		// 람다식
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("Hello", "World");
		
		// 람다식 컴파일시
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		concat2.makeString("Hello", "World");
	}

}
