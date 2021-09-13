package lamda.stringconcat;

public class StringConcatTest {

	public static void main(String[] args) {
		// ��ü �����
		StringConcatSub concatSub = new StringConcatSub();
		concatSub.makeString("Hello", "World");
		
		// ���ٽ�
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("Hello", "World");
		
		// ���ٽ� �����Ͻ�
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		concat2.makeString("Hello", "World");
	}

}
