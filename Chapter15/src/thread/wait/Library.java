package thread.wait;

import java.util.ArrayList;

public class Library {
	public ArrayList<String> bookList = new ArrayList<>();
	
	Library() {
		bookList.add("ÅÂ¹é»ê¸Æ 1");
		bookList.add("ÅÂ¹é»ê¸Æ 2");
		bookList.add("ÅÂ¹é»ê¸Æ 3");
	}
	
	public String rentalBook() throws InterruptedException {
		synchronized (this) {
			Thread currentThread = Thread.currentThread();
			while(bookList.size() == 0) {
				System.out.println(currentThread.getName() + " wating start");
				wait();
				System.out.println(currentThread.getName() + " wating end");
			}
			String title = bookList.remove(0);
			System.out.println(currentThread.getName() + ": " + title + " rental");
			return title;
		}
	}
	
	public void returnBook(String bookName) {
		synchronized (this) {
			Thread currentThread = Thread.currentThread();
			bookList.add(bookName);
			notifyAll();
			System.out.println(currentThread.getName() + ": " + bookName + " return");
		}
	}
}
