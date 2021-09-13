package exeption.throwsex;

import java.io.FileNotFoundException;

public class ThrowsExceptionTest {

	public static void main(String[] args) {
		ThrowsException testExeption = new ThrowsException();
		try {
			testExeption.loadClass("a.txt", "java.lang.string"); // String이 맞는 표기
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
