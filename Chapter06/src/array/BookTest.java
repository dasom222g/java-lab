package array;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		String[] bookTitles = {"�¹���1", "�¹���2", "�¹���3", "�¹���4", "�¹���5"};
		String[] bookAuthors = {"������1", "������2", "������3", "������4", "������5"};
		
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(bookTitles[i], bookAuthors[i]);
			System.out.println("library[i]" + library[i]);
			library[i].showBook();
		}
	}

}
