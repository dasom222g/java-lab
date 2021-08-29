package arraylist;

public class CharArrayTest {

	public static void main(String[] args) {
		// 알파벳 배열 만들기
		char[] alphabet = new char[26];
		char speling = 'A';
		for(int i = 0; i < alphabet.length; i++) {
			if (speling == 'Z') alphabet[i] = speling;
			else alphabet[i] = speling++; // 값 대입후 증가
			System.out.println("문자형" + ": " + alphabet[i] + ", 정수형" + ": " + (int)alphabet[i]);
		}
		System.out.println(speling);
	}

}
