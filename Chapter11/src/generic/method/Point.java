package generic.method;

public class Point<T,V> {
	public T x;
	public V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T GetX() {
		return x;
	}
	
	public V GetY() {
		return y;
	}
}
