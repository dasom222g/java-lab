package interfaceExample.test;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String bookName) {
		super.bookList.add(bookName);
	}

	@Override
	public String deQueue() {
		return super.bookList.remove(0);
	}


	@Override
	public ArrayList<String> getBooks() {
		return super.getShelf();
	}
	
	@Override
	public int getSize() {
		return super.getCount();
	}
}
