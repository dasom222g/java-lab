package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = "java";
		String android = "adroid";
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder));
		builder.append(android);
		builder.append("add");
		builder.replace(0, builder.length(), "change");
		System.out.println(builder.length());
		System.out.println(System.identityHashCode(builder));
		
		java = builder.toString(); // change
	}

}
