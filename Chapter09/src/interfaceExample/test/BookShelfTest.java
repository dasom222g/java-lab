package interfaceExample.test;

import java.util.ArrayList;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		String[] books = {"������ �ɸ���", "������ ����", "Men's helth", "Ʈ���϶���", "����"};
		
		for(int i = 0; i < books.length; i++) {
			bookQueue.inQueue(books[i]);
		}
		
		ArrayList<String> bookNames = bookQueue.getBooks();
		System.out.println("������ å�� " + bookQueue.deQueue() + " �̰� å�忡 ���� å��" + bookQueue
				.getSize() + "�� �Դϴ�.");
		
		System.out.println();
		
		for (String book : bookNames) {
			System.out.print("����å�� " + book + " �Դϴ�");
		}
	
	}

}
