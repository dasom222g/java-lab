package object;

public class ToStringTest {

	public static void main(String[] args) {
		String text = new String("text22222");
		System.out.println(text.toString());
		
		Book book = new Book("토지", "박경리");
		System.out.println(book);
	}

}
