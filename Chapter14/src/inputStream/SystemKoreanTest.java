package inputStream;

import java.io.IOException;
import java.io.InputStreamReader;


public class SystemKoreanTest {

	public static void main(String[] args) {
		System.out.println("�ѱ� �Է��� '��'�̶�� �Է��ϼ���");
		try {
			int i;
			InputStreamReader supportStream = new InputStreamReader(System.in);
			while((i = supportStream.read()) != '��') {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
