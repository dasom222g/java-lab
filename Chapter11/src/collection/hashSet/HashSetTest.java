package collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); // String��ҷ� �̷���� HashSet ����
		hashSet.add("��ټ�");
		hashSet.add("�輺��");
		hashSet.add("�ڸ���");
		hashSet.add("��ټ�"); // �ߺ����� �߰����� ����

		System.out.println(hashSet);
		Iterator<String> ir = hashSet.iterator(); // �ݺ���
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
