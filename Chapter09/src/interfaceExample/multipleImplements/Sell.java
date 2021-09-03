package interfaceExample.multipleImplements;

public interface Sell {
	public void sell();
	public default void order() {
		System.out.println("Sell order");
	};
}
