package interfaceExample.sort;

public interface Sort {
	public void ascending(int[] numberArray);
	public void descending(int[] numberArray);
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
