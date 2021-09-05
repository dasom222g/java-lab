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
		Sort.super.description(); // Sort 인터페이스의 디폴트 메소드 호출
		System.out.println("HeaSort 입니다.");
	}

}
