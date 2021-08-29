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
		
		// 값을 입력받아 더하기 (입력값이 0일 경우 종료)
		int input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		int sumInput = 0;
		while (input != 1) {
			sumInput += input;
			System.out.println("내부: " + sumInput);
			input = scanner.nextInt(); // 이 위치에서 기다리고 있기 때문에 scanner 입력받는 위치를 블록 제일 하단에 해야 함
		}
		System.out.println("sum " + sumInput);
		scanner.close();
	}

}
