package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		char operator = '/';
		int num1 = 5;
		int num2 = 10;
		int result = 0;
		if (operator == '+') result = num1 + num2;
		else if (operator == '-') result = num1 - num2;
		else if (operator == 'x') result = num1 * num2;
		else if (operator == '/') result = num1 / num2;
		else System.out.println("Error");
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		*/
		
		// 다이아몬드 출력
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		int spaceCount = line/2 + 1;
		int starCount = 1;
		for (int i = 0; i <= line; i++) { // 라인 수
			for(int j = 0; j < spaceCount; j++) { // 앞 공백
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) { // 별
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) { // 뒷 공백
				System.out.print(" ");
			}
			if (i < line / 2) {
				spaceCount -= 1;
				starCount += 2;
			} else {
				spaceCount += 1;
				starCount -= 2;
			}
			System.out.println();
		}
		scanner.close();
	}

}
