package inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = console.readLine(); // ���� �о����
		System.out.println("��й�ȣ�� �Է��ϼ���");
		char[] password = console.readPassword();
		
		System.out.println("�̸�: " + name + "" + String.valueOf(password));
	}

}
