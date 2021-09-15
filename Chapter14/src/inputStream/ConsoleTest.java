package inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름을 입력하세요");
		String name = console.readLine(); // 한줄 읽어들임
		System.out.println("비밀번호을 입력하세요");
		char[] password = console.readPassword();
		
		System.out.println("이름: " + name + "" + String.valueOf(password));
	}

}
