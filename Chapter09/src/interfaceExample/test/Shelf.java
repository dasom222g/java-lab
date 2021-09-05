package interfaceExample.test;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> bookList;
	
	public Shelf() {
		bookList = new ArrayList<String>();
	}
	
	protected ArrayList<String> getShelf() {
		return bookList;
	}
	
	protected int getCount() {
		return bookList.size();
	}
}
