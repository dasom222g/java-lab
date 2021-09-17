package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("�̼���", "������");
		Person personKim = new Person("��ټ�", "����");
		
		String fileName = "person.dat";
		
		// ���Ͽ� �ڷ� �ۼ�
		try(FileOutputStream outFile = new FileOutputStream(fileName);
			ObjectOutputStream objOutFile = new ObjectOutputStream(outFile);) {
			objOutFile.writeObject(personLee);
			objOutFile.writeObject(personKim);
			
		} catch(NotSerializableException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		// ���� �����ͼ� ���
		try(FileInputStream inputFile = new FileInputStream(fileName);
			ObjectInputStream objInputFile = new ObjectInputStream(inputFile);) {
			
			Object p1 = objInputFile.readObject();
			Object p2 = objInputFile.readObject();
			
			if(p1 instanceof Object) {
				p1 = (Person)p1;
				p2 = (Person)p2;
			}
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
