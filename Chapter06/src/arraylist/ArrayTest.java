package arraylist;

public class ArrayTest {

	public static void main(String[] args) {
		// ���� ���ϱ�
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0, num = 1; i< arr.length; i++, num++) {
			arr[i] = num;
			sum += num;
			System.out.println(i + "��° ��: " + arr[i]);
		}
		System.out.println(sum);
	}

}
