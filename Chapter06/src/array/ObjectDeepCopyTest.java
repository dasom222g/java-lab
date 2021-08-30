package array;

public class ObjectDeepCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		String[] bookTitles = {"�¹���1", "�¹���2", "�¹���3", "�¹���4", "�¹���5"};
		String[] bookAuthors = {"������1", "������2", "������3", "������4", "������5"};
		
		// library, copyLibrary �ν��Ͻ� ���� �� ����
		for(int i = 0; i < library.length; i++) {
			library[i] = new Book(bookTitles[i], bookAuthors[i]);
			copyLibrary[i] = new Book(); // �� �ν��Ͻ� ����
		}
		
		for(int i = 0; i < copyLibrary.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		copyLibrary[0].setTitle("����");
		copyLibrary[0].setAuthor("�ڿϼ�");
		
		// library, copyLibrary �� Ȯ��
		for(Book book: library) {
			book.showBook();
		}
		System.out.println("==============================");
		for(Book book: copyLibrary) {
			book.showBook();
		}
	}

}
