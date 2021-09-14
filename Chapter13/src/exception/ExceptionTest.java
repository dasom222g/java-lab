package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("b.txt"); //파일 스트림 오픈
		} catch (FileNotFoundException e) {
			// file없을경우 예외처리
			System.out.println(e);
			return;
		} finally {
			try {
				file.close(); // 파일 스트림 클로즈
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
		
	}
}
