package interfaceExample.sort;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] numberArray) {
		System.out.println("HeaSort ascending");
	}

	@Override
	public void descending(int[] numberArray) {
		System.out.println("HeaSort descending");
	}

	@Override
	public void description() {
		Sort.super.description(); // Sort �������̽��� ����Ʈ �޼ҵ� ȣ��
		System.out.println("HeaSort �Դϴ�.");
	}

}
