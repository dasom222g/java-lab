package inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputAutoCloseTest {

	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("input.txt")) {
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("end");
	}

}
