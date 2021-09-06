package interfaceExample.sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		Sort sort;
		int[] numbers = {1,2,3};
		
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeaSort");
		System.out.println("Q : QuickSort");
		
		int input = System.in.read();
		
		if(input == 'B' || input == 'b') {
			sort = new BubbleSort();
		} else if(input == 'H' || input == 'h') {
			sort = new HeapSort();
		} else if(input == 'Q' || input == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		sort.ascending(numbers);
		sort.descending(numbers);
		sort.description();
	}

}
