package conditional;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rank = scanner.nextInt();
		char medalColor;
		switch (rank) {
			case 1: 
				medalColor = '��';
				System.out.println("�ݸ޴�");
//				break;
			case 2: 
				medalColor = '��';
				System.out.println("���޴�");
//				break;
			case 3: 
				medalColor = '��';
				System.out.println("���޴�");
				break;
			default:
				medalColor = '��';
				System.out.println("�����ϼ̽��ϴ�");
		}
		
		System.out.println("�޴� ����: " + medalColor);
		
		scanner.close();
	}

}
