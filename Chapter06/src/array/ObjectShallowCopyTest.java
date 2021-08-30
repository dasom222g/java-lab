package array;

public class ObjectShallowCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		String[] bookTitles = {"태백산맥1", "태백산맥2", "태백산맥3", "태백산맥4", "태백산맥5"};
		String[] bookAuthors = {"조정래1", "조정래2", "조정래3", "조정래4", "조정래5"};
		
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(bookTitles[i], bookAuthors[i]);
		}
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);
		
		copyLibrary[0].setTitle("나목");
		copyLibrary[0].setAuthor("박완서");
		
		// library 길이만큼 돌고 각 배열의 값을 item에 넣음
		for(Book book : library) {
			book.showBook();
		}
	}

}
