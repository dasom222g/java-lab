package loop;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
//		int num = 1;
//		int sum = 0;
//		while (num <= 10) {
//			sum += num;
//			num++;
//		}
//		System.out.println("sum " + sum + " num " + num);
		
		// ���� �Է¹޾� ���ϱ� (�Է°��� 0�� ��� ����)
		int input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		int sumInput = 0;
		while (input != 1) {
			sumInput += input;
			System.out.println("����: " + sumInput);
			input = scanner.nextInt(); // �� ��ġ���� ��ٸ��� �ֱ� ������ scanner �Է¹޴� ��ġ�� ��� ���� �ϴܿ� �ؾ� ��
		}
		System.out.println("sum " + sumInput);
		scanner.close();
	}

}
