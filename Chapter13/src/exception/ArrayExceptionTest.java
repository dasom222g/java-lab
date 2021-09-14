package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[5]; // 5length배열 생성
		
		try {			
			for(int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("에러 후 실행??");
	}

}
