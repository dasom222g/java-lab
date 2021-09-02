package abstractExample;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new Desktop();
		Computer lapTop = new MyLaptop();
		
		desktop.turnOn();
		lapTop.turnOff();
		
		desktop.display();
		desktop.typing();
		lapTop.display();
		lapTop.typing();
	}

}
