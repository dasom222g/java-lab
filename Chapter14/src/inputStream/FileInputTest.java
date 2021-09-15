package inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("input.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("end");
	}

}
