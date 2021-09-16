package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		long ms = 0;
		
		try(
			FileInputStream inputFile = new FileInputStream("mockup.pptx");
			FileOutputStream outputFile = new FileOutputStream("mokup_copy.pptx");
			BufferedInputStream bufferInputFile = new BufferedInputStream(inputFile);
			BufferedOutputStream bufferOutputFile = new BufferedOutputStream(outputFile);
		) {
			ms = System.currentTimeMillis(); // 작업전 밀리초
			// 기본스트림으로 복사한 경우
//			int data;
//			while((data = inputFile.read()) != -1) {
//				outputFile.write(data);
//			}
			// Buffe스트림으로 복사한 경우
			int data;
			while((data = bufferInputFile.read()) != -1) {
				bufferOutputFile.write(data);
			}
			
			ms = System.currentTimeMillis() - ms; // 작업후 밀리초
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("걸린시간: " + ms);
	}

}
