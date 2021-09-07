package object;

class BookClone implements Cloneable {
	private String name;
	private String author;
	
	BookClone(String name, String author) {
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
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		String text = new String("text22222");
		System.out.println(text.toString());
		
		BookClone book = new BookClone("토지", "박경리");
		BookClone bookCopy = (BookClone)book.clone();
		System.out.println(System.identityHashCode(book));
		System.out.println(System.identityHashCode(bookCopy));
		System.out.println(bookCopy.getAuthor());
	}

}
