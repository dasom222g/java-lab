package inputStream;

import java.io.IOException;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println("�Է��ϼ���");
		try {
			int i = System.in.read(); // read�޼ҵ�� ���� ��ȯ, �Ѱ��� ���ڸ� �о����
			System.out.println(i + " " + (char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
