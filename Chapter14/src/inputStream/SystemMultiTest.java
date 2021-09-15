package inputStream;

import java.io.IOException;

public class SystemMultiTest {

	public static void main(String[] args) {
		System.out.println("입력하세요");
		try {
			int i;
			while((i = System.in.read()) != 'e') { // new라인이 되기 전까지 읽어들임
				System.out.print(i + " " + (char)i + " ");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
