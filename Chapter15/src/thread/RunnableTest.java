package thread;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class RunnableTest {

	public static void main(String[] args) {
		System.out.println("main tread start");
		
		MyRunnable runnable1 = new MyRunnable();
		MyRunnable runnable2 = new MyRunnable();
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		// thread ½ÇÇà
		thread1.start();
		thread2.start();
		
		System.out.println("main tread end");
	}

}
