package conditional;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		char gender = 'm';
		if (gender == 'F') System.out.println("�����Դϴ�");
		else if (gender == 'M') System.out.println("�����Դϴ�");
//		else System.out.println("�߸� �ԷµǾ����ϴ�");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;
		
		if (age < 8) charge = 1000;
		else if(age < 14) charge = 1500;
		else if(age < 20) charge = 2000;
		else charge = 3000;
		System.out.println("����: " + age + " ���: " + charge);
//		
		scanner.close();
	}

}
