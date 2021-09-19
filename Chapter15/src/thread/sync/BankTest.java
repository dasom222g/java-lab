package thread.sync;

public class BankTest {

	public static void main(String[] args) throws InterruptedException {
		Park park = new Park();
		park.start();
		
		Thread.sleep(200);
		ParkWife parkWife = new ParkWife();
		parkWife.start();
	}

}
