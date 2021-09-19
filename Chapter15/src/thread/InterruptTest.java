package thread;

class Interrupt extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("wake!!!");
		}
	}
}

public class InterruptTest {

	public static void main(String[] args) {
		Interrupt thread = new Interrupt();
		thread.start();
		
		thread.interrupt(); // 메소드 호출시 sleep기다리지 않고 바로 catch문으로 빠짐
	}

}
