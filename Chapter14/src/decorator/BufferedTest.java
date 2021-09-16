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
			ms = System.currentTimeMillis(); // �۾��� �и���
			// �⺻��Ʈ������ ������ ���
//			int data;
//			while((data = inputFile.read()) != -1) {
//				outputFile.write(data);
//			}
			// Buffe��Ʈ������ ������ ���
			int data;
			while((data = bufferInputFile.read()) != -1) {
				bufferOutputFile.write(data);
			}
			
			ms = System.currentTimeMillis() - ms; // �۾��� �и���
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�ɸ��ð�: " + ms);
	}

}
