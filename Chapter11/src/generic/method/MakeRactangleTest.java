package generic.method;

public class MakeRactangleTest {

	public static void main(String[] args) {
		Point<Integer, Double> point1 = new Point<>(10, 0.5);
		Point<Integer, Double> point2 = new Point<>(5, 0.9);
		
		// static 메소드 사용으로 생성안하고 사용
		System.out.println(MakeRactangle.makeRactangle(point1, point2));
	}

}
