package interfaceExample.test;

import java.util.ArrayList;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		String[] books = {"설득의 심리학", "반지의 제왕", "Men's helth", "트와일라잇", "개미"};
		
		for(int i = 0; i < books.length; i++) {
			bookQueue.enQueue(books[i]);
		}
		
		ArrayList<String> bookNames = bookQueue.getBooks();
		System.out.println("삭제된 책은 " + bookQueue.deQueue() + " 이고 책장에 남은 책은" + bookQueue
				.getSize() + "권 입니다.");
		
		System.out.println();
		
		for (String book : bookNames) {
			System.out.println("남은책은 " + book + " 입니다.");
		}
	
	}

}
