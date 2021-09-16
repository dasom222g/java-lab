package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try (
			FileOutputStream outFile = new FileOutputStream("data.txt");
			DataOutputStream dataOutFile = new DataOutputStream(outFile);
			FileInputStream inFile = new FileInputStream("data.txt");
			DataInputStream dataInFile = new DataInputStream(inFile);
		) {
			
			// 쓰기
//			outFile.write(65);
//			outFile.write('A');
			
			dataOutFile.writeByte(100); //1바이트
			dataOutFile.write(10); // 4바이트
			
			dataOutFile.writeInt(123);
			dataOutFile.writeChar('A');
			dataOutFile.writeUTF("안녕하세용");
			dataOutFile.writeBoolean(false);
			
			// 읽기
//			int i;
//			while((i = inFile.read()) != -1) {
//				System.out.println(i);
//			}
			
			System.out.println(dataInFile.readByte());
			System.out.println(dataInFile.read());
			
			System.out.println(dataInFile.readInt());
			System.out.println(dataInFile.readChar());
			System.out.println(dataInFile.readUTF());
			System.out.println(dataInFile.readBoolean());
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
