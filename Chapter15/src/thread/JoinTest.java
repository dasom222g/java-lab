package thread;

class Join extends Thread {
	int start;
	int end;
	int total = 0;
	
	Join(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		for(int i = start; i <= end; i++) {
			total += i;
		}
	}
}

public class JoinTest {

	public static void main(String[] args) {
		Join thread1 = new Join(1, 50);
		Join thread2 = new Join(51, 100);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int total = thread1.total + thread2.total;
		System.out.println("thread1 total: " +  thread1.total);
		System.out.println("thread2 total: " +  thread2.total);
		
		System.out.println("2°³ threadÀÇ total: " + total);
		
	}

}
