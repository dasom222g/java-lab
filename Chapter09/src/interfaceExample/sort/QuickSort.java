package interfaceExample.sort;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] numberArray) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] numberArray) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort ¿‘¥œ¥Ÿ.");
	}
	
}
