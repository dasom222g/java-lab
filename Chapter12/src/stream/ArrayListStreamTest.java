package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("James");
		list.add("Edward");
		list.add("Tomas");
		
		list.stream().sorted().forEach(item -> System.out.println(item));
	}

}
