package conditional;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rank = scanner.nextInt();
		char medalColor;
		switch (rank) {
			case 1: 
				medalColor = '금';
				System.out.println("금메달");
//				break;
			case 2: 
				medalColor = '은';
				System.out.println("은메달");
//				break;
			case 3: 
				medalColor = '동';
				System.out.println("동메달");
				break;
			default:
				medalColor = '없';
				System.out.println("수고하셨습니다");
		}
		
		System.out.println("메달 색상: " + medalColor);
		
		scanner.close();
	}

}
