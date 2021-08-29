package arraylist;

public class ArrayTest {

	public static void main(String[] args) {
		// 숫자 더하기
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0, num = 1; i< arr.length; i++, num++) {
			arr[i] = num;
			sum += num;
			System.out.println(i + "번째 값: " + arr[i]);
		}
		System.out.println(sum);
	}

}
