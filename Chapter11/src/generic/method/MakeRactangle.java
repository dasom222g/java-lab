package generic.method;

public class MakeRactangle {
	public static <T,V> double makeRactangle(Point<T, V>p1, Point<T, V>p2) {
		double left = ((Number)p1.GetX()).doubleValue();
		double right = ((Number)p2.GetX()).doubleValue();
		double top = ((Number)p1.GetY()).doubleValue();
		double bottom = ((Number)p2.GetY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
}
