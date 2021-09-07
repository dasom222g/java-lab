package object;

class Book {
	private String name;
	private String author;
	
	Book(String name, String author) {
		init(name, author);
	}
	
	public void init(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
//		return super.toString();
		return "책이름: " + name + ", 저자" + author;
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		String text = new String("text22222");
		System.out.println(text.toString());
		
		Book book = new Book("토지", "박경리");
		System.out.println(book);
	}

}
