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
		
		// 값을 입력받아 더하기 (입력값이 0일 경우 종료)
		Scanner scanner = new Scanner(System.in);
		int input;
		int sumInput = 0;
		do {
			input = scanner.nextInt(); // 최초 한번과 while문이 true일 때 계속해서 입력 값을 받음
			sumInput += input;
		} while (input != 0);
		System.out.println("sum " + sumInput);
		scanner.close();
	}

}
