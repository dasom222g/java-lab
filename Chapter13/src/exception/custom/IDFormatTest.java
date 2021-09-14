package exception.custom;

public class IDFormatTest {

	public static void main(String[] args) {
		IDFormat idTest;
		
		try {
			idTest = new IDFormat(null);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		try {
			idTest = new IDFormat("1234567");
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
