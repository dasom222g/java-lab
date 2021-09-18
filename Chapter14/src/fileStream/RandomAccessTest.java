package fileStream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {

	public static void main(String[] args) {
		try(RandomAccessFile file = new RandomAccessFile("random.txt", "rw");) {
			// ���
			file.writeInt(100);
			System.out.println(file.getFilePointer()); // 4
			file.writeDouble(3.14);
			System.out.println(file.getFilePointer()); // 12
			file.writeUTF("�ȳ��ϼ���");
			System.out.println(file.getFilePointer()); // 29
			file.seek(0);
			// �Է�
			int intData = file.readInt();
			System.out.println(file.getFilePointer());
			double doubleData = file.readDouble();
			System.out.println(file.getFilePointer());
			String stringData = file.readUTF();
			System.out.println(stringData);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
