package inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputByteArrayTest {

	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("input2.txt")) {
			int textLength;
			byte[] byteArr = new byte[10];
			while((textLength = file.read(byteArr)) != -1) {
				System.out.println("i: " + textLength);
				for(int i = 0; i < textLength; i++) {
					System.out.print((char)byteArr[i]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("end");
	}

}
