package conditional;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		char gender = 'm';
		if (gender == 'F') System.out.println("여성입니다");
		else if (gender == 'M') System.out.println("남성입니다");
//		else System.out.println("잘못 입력되었습니다");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;
		
		if (age < 8) charge = 1000;
		else if(age < 14) charge = 1500;
		else if(age < 20) charge = 2000;
		else charge = 3000;
		System.out.println("나이: " + age + " 요금: " + charge);
//		
		scanner.close();
	}

}
