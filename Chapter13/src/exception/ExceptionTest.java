package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("b.txt"); //���� ��Ʈ�� ����
		} catch (FileNotFoundException e) {
			// file������� ����ó��
			System.out.println(e);
			return;
		} finally {
			try {
				file.close(); // ���� ��Ʈ�� Ŭ����
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
		
	}
}
