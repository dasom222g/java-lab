package collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); // String요소로 이루어진 HashSet 선언
		hashSet.add("김다솜");
		hashSet.add("김성태");
		hashSet.add("박맹임");
		hashSet.add("김다솜"); // 중복으로 추가되지 않음

		System.out.println(hashSet);
		Iterator<String> ir = hashSet.iterator(); // 반복자
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
