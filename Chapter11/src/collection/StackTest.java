package collection;

import java.util.ArrayList;

class MyStack {
	ArrayList<String> stackList = new ArrayList<String>();
	
	public void push(String text) {
		stackList.add(text);
	}
	
	public String pop() {
		int length = stackList.size();
		if(length == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		return stackList.remove(length - 1);
	}

	@Override
	public String toString() {
		String item = "";
		for(int i = 0; i < stackList.size(); i++) {
			if (i == stackList.size() - 1) item += stackList.get(i);
			else item += stackList.get(i) + ",";
		}
		return "[" + item + "]";
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		
		System.out.println(myStack.pop());
		System.out.println(myStack);
		
	}
}
