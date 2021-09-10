package interfaceExample.test;

import java.util.ArrayList;

public interface Queue {
	public void enQueue(String bookName);
	public String deQueue();
	public int getSize();
	public ArrayList<String> getBooks();
}
