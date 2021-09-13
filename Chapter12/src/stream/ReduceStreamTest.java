package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String a, String b) {
		if(a.getBytes().length >= b.getBytes().length) return a;
		return b;
	}

}

public class ReduceStreamTest {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다"};
		// 바이트길이가 가장 긴 문자열을 구하는 reduce
		String result = Arrays.stream(greetings).reduce("", (a, b) -> {
			if (a.getBytes().length >= b.getBytes().length) return a;
			return b;
		});
		
		String resultBi = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(result);
		System.out.println(resultBi);
	}

}
