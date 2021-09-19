package thread.sync.inthread;

public class Bank {
	private int amount = 10000;
	
	public void saveMoney(int money) {
		int amount = getAmount();
		try {
			Thread.sleep(1000);
			setAmount(amount + money);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public void minusMoney(int money) {
		int amount = getAmount();
		try {
			Thread.sleep(200);
			setAmount(amount - money);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
