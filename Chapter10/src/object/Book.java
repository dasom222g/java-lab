package object;

public class Book {
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
