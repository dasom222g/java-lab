package collection;

import java.util.LinkedList;

class MyQueue {
	LinkedList<String> queueList = new LinkedList<String>(); 
	
	public void enqueue(String text) {
		queueList.add(text);
	}
	
	public String dequeue() {
		return queueList.remove(0);
	}
	
	@Override
	public String toString() {
		String item = "";
		for(int i = 0; i < queueList.size(); i++) {
			if (i == queueList.size() - 1) item += queueList.get(i);
			else item += queueList.get(i) + ",";
		}
		return "[" + item + "]";
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue("A");
		myQueue.enqueue("B");
		myQueue.enqueue("C");
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue);
	}
}
