package array;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		String[] bookTitles = {"태백산맥1", "태백산맥2", "태백산맥3", "태백산맥4", "태백산맥5"};
		String[] bookAuthors = {"조정래1", "조정래2", "조정래3", "조정래4", "조정래5"};
		
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(bookTitles[i], bookAuthors[i]);
			System.out.println("library[i]" + library[i]);
			library[i].showBook();
		}
	}

}
