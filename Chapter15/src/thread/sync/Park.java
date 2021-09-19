package thread.sync;

public class Park extends Thread {

	@Override
	public void run() {
		System.out.println("save start");
		Static.bank.saveMoney(3000);
		System.out.println("saved amount: " + Static.bank.getAmount());
	}
	
}
