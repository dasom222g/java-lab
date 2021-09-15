package outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputByteArrayTest {

	public static void main(String[] args) {
		byte[] byteArr = new byte[26];
		byte aNum = 65;
		for(int i = 0; i < byteArr.length; i++) {
			byteArr[i] = aNum++;
		}
		
		try(
			FileOutputStream file = new FileOutputStream("output_alphabet.txt", true);
			FileInputStream inputFile = new FileInputStream("output_alphabet.txt");
		) {
			// file에 자료 작성
			file.write(byteArr);
			file.write((int)' ');
			
			// file 가져오기
			byte[] inputByteArr = new byte[26];
			int i;
			while((i = inputFile.read(inputByteArr)) != -1) {
				for(int k = 0; k < i; k++) {
					System.out.print((char)inputByteArr[k]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
