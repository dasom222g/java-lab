package inputStream;

import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println("입력하세요");
		try {
			int i = System.in.read(); // read메소드는 정수 반환, 한개의 문자만 읽어들임
			System.out.println(i + " " + (char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
