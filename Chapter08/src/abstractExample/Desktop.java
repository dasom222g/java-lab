package abstractExample;

public class Desktop extends Computer {

	@Override
	protected void display() {
		System.out.println("Desktop Display");
	}

	@Override
	protected void typing() {
		System.out.println("Desktop Typing");
		
	}
	
}
