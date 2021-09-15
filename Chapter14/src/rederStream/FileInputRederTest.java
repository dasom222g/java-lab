package rederStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputRederTest {

	public static void main(String[] args) {
		FileInputStream byteFile = null;
		InputStreamReader readerFile = null;
		try {
			byteFile = new FileInputStream("read.txt"); // 이미 바이트 단위로 file 읽음
			readerFile = new InputStreamReader(byteFile);
			int i;
			while((i = readerFile.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				byteFile.close();
				readerFile.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
//		System.out.println("end");
	}

}
