package inputStream;

import java.io.IOException;

public class SystemMultiTest {

	public static void main(String[] args) {
		System.out.println("�Է��ϼ���");
		try {
			int i;
			while((i = System.in.read()) != 'e') { // new������ �Ǳ� ������ �о����
				System.out.print(i + " " + (char)i + " ");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
