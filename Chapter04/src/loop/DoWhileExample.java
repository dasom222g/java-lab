package loop;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		}
		while (num <= 10);
		 System.out.println("sum " + sum + " num " + num);
		
		// ���� �Է¹޾� ���ϱ� (�Է°��� 0�� ��� ����)
		Scanner scanner = new Scanner(System.in);
		int input;
		int sumInput = 0;
		do {
			input = scanner.nextInt(); // ���� �ѹ��� while���� true�� �� ����ؼ� �Է� ���� ����
			sumInput += input;
		} while (input != 0);
		System.out.println("sum " + sumInput);
		scanner.close();
	}

}
