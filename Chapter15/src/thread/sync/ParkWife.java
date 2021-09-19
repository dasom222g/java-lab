package thread.sync;

public class ParkWife extends Thread {

	@Override
	public void run() {
		System.out.println("minus start");
		Static.bank.minusMoney(1000);
		System.out.println("miuns amount: " + Static.bank.getAmount());
	}
	
}
