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
		String[] greetings = {"�ȳ��ϼ���~~~", "hello", "Good morning", "�ݰ����ϴ�"};
		// ����Ʈ���̰� ���� �� ���ڿ��� ���ϴ� reduce
		String result = Arrays.stream(greetings).reduce("", (a, b) -> {
			if (a.getBytes().length >= b.getBytes().length) return a;
			return b;
		});
		
		String resultBi = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(result);
		System.out.println(resultBi);
	}

}
