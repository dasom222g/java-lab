package inputStream;

import java.io.IOException;
import java.io.InputStreamReader;


public class SystemKoreanTest {

	public static void main(String[] args) {
		System.out.println("한글 입력후 '끝'이라고 입력하세요");
		try {
			int i;
			InputStreamReader supportStream = new InputStreamReader(System.in);
			while((i = supportStream.read()) != '끝') {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
