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
		
		// ���̾Ƹ�� ���
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		int spaceCount = line/2 + 1;
		int starCount = 1;
		for (int i = 0; i <= line; i++) { // ���� ��
			for(int j = 0; j < spaceCount; j++) { // �� ����
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) { // ��
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) { // �� ����
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
