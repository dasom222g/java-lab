package interfaceExample.sort;

public class HeaSort implements Sort {

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
