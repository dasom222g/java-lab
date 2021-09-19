package thread;

import java.io.IOException;

class Terminate extends Thread {
	private boolean flag = false;
	
	Terminate(String threadName) {
		super(threadName); // 스레드 이름 정해줌
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
				System.out.println("sleep");
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}

public class TerminateThreadTest {

	public static void main(String[] args) throws IOException {
		Terminate threadA = new Terminate("A");
		Terminate threadB = new Terminate("B");
		threadA.start();
		threadB.start();

		int terminateThreadName;
		while(true) {
			terminateThreadName = System.in.read();
			if(terminateThreadName == 'A') {
				threadA.setFlag(true);
			} else if(terminateThreadName == 'B') {
				threadB.setFlag(true);
			} else if(terminateThreadName == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				break;
			} else {
				System.out.println("try agin");
			}
		}
		System.out.println("main end");
	}

}
