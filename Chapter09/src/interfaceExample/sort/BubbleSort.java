package interfaceExample.sort;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] numberArray) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] numberArray) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort ¿‘¥œ¥Ÿ.");
	}

}
