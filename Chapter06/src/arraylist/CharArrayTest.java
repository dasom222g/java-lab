package arraylist;

public class CharArrayTest {

	public static void main(String[] args) {
		// ���ĺ� �迭 �����
		char[] alphabet = new char[26];
		char speling = 'A';
		for(int i = 0; i < alphabet.length; i++) {
			if (speling == 'Z') alphabet[i] = speling;
			else alphabet[i] = speling++; // �� ������ ����
			System.out.println("������" + ": " + alphabet[i] + ", ������" + ": " + (int)alphabet[i]);
		}
		System.out.println(speling);
	}

}
