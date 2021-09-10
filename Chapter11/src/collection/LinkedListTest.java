package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		String[] texts = {"A", "B", "C", "D"};
		for(String text: texts) {
			myList.add(text);
		}
		System.out.println(myList);
		
		myList.add(2, "E");
		System.out.println(myList);
		
		myList.remove(); // ù��° ��� ����
		myList.removeLast(); // ������ ��� ����
		System.out.println(myList);
	}

}
