package thread.wait;

public class Student extends Thread {

	@Override
	public void run() {
		try {
			// å ������ 3�ʵ��� �а� �ݳ�
			String bookName = Static.library.rentalBook();
//			if(bookName == null) return;
			sleep(3000);
			Static.library.returnBook(bookName);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
}
