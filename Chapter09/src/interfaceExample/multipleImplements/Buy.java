package interfaceExample.multipleImplements;

public interface Buy {
	public void buy();
	public default void order() {
		System.out.println("Buy order");
	}
}
