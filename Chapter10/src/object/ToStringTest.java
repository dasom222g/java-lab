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
		return "å�̸�: " + name + ", ����" + author;
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		String text = new String("text22222");
		System.out.println(text.toString());
		
		Book book = new Book("����", "�ڰ渮");
		System.out.println(book);
	}

}
