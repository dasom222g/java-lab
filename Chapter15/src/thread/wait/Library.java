package thread.wait;

import java.util.ArrayList;

public class Library {
	public ArrayList<String> bookList = new ArrayList<>();
	
	Library() {
		bookList.add("�¹��� 1");
		bookList.add("�¹��� 2");
		bookList.add("�¹��� 3");
	}
	
	public String rentalBook() {
		synchronized (this) {
			Thread currentThread = Thread.currentThread();
			String title = bookList.remove(0);
			System.out.println(currentThread.getName() + ": " + title + "rental");
			return title;
		}
	}
	
	public void returnBook(String bookName) {
		synchronized (this) {
			Thread currentThread = Thread.currentThread();
			bookList.add(bookName);
			System.out.println(currentThread.getName() + ": " + bookName + "return");
		}
	}
}
