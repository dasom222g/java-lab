package array;

public class multidimensionalArrayTest {

	public static void main(String[] args) {
		// int[][] multiArr = new int[2][3];
		int[][] multiArr = {{1,2,3}, {10,20,30,40}};
		System.out.println(multiArr.length);
		for(int i = 0; i < multiArr.length; i++) {
			for(int j = 0; j < multiArr[i].length; j++) {
				System.out.print(multiArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
