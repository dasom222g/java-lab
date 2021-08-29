package arraylist;

public class Book {
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		setTitle(title);
		setAuthor(author);
	}
	
	public void showBook() {
		System.out.println(title + ", " + author);
	}
	
	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
