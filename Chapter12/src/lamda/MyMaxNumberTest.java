package lamda;

public class MyMaxNumberTest {

	public static void main(String[] args) {
		MyMaxNumber max = (x,y) -> x > y ? x : y;
		System.out.println(max.getMaxNumber(50, 51));
	}

}
