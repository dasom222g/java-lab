package loop;

public class ForExample {

	public static void main(String[] args) {
		int val = 1;
		int sum = 0;
		for(int i = 0; i <10; i++, val++) { // 다른 변수 증감식 뒤에 여러개 쓸수 있음
			sum += val;
		}
		System.out.println("sum " + sum);
	}

}
