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
			
			// ����
//			outFile.write(65);
//			outFile.write('A');
			
			dataOutFile.writeByte(100); //1����Ʈ
			dataOutFile.write(10); // 4����Ʈ
			
			dataOutFile.writeInt(123);
			dataOutFile.writeChar('A');
			dataOutFile.writeUTF("�ȳ��ϼ���");
			dataOutFile.writeBoolean(false);
			
			// �б�
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
