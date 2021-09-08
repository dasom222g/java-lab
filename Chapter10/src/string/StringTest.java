package string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "aaa";
		System.out.println(System.identityHashCode(str1));
		str1 = "bbb";
		System.out.println(System.identityHashCode(str1));
	}

}
