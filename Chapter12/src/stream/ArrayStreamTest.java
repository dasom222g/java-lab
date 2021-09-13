package stream;

import java.util.Arrays;

public class ArrayStreamTest {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		int sum = Arrays.stream(intArr).sum();
		int count = (int)Arrays.stream(intArr).filter(num -> num > 3).count();
		
		System.out.println(sum); // 15
		System.out.println(count); //12
		
		// reduce
		int addResult = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
		System.out.println(addResult);
	}

}
