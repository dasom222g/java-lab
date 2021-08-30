package array;

public class ObjectDeepCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		String[] bookTitles = {"태백산맥1", "태백산맥2", "태백산맥3", "태백산맥4", "태백산맥5"};
		String[] bookAuthors = {"조정래1", "조정래2", "조정래3", "조정래4", "조정래5"};
		
		// library, copyLibrary 인스턴스 생성 및 복사
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(bookTitles[i], bookAuthors[i]);
			copyLibrary[i] = new Book(); // 빈 인스턴스 생성
		}
		
		for(int i = 0; i < copyLibrary.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		copyLibrary[0].setTitle("나목");
		copyLibrary[0].setAuthor("박완서");
		
		// library, copyLibrary 값 확인
		for(Book book: library) {
			book.showBook();
		}
		System.out.println("==============================");
		for(Book book: copyLibrary) {
			book.showBook();
		}
	}

}
