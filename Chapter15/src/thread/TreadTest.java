package thread;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class TreadTest {

	public static void main(String[] args) {
		System.out.println("main tread start");
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		// thread ½ÇÇà
		thread1.start();
		thread2.start();
		System.out.println("main tread end");
	}

}
