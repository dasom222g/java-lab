package loop;

public class ForExample {

	public static void main(String[] args) {
		int val = 1;
		int sum = 0;
		for(int i = 0; i <10; i++, val++) { // �ٸ� ���� ������ �ڿ� ������ ���� ����
			sum += val;
		}
		System.out.println("sum " + sum);
	}

}
