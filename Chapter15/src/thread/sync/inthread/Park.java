package thread.sync.inthread;

public class Park extends Thread {

	@Override
	public void run() {
		synchronized (Static.bank) {
			System.out.println("save start");
			Static.bank.saveMoney(3000);
			System.out.println("saved amount: " + Static.bank.getAmount());
		}
	}
	
}
