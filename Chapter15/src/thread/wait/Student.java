package thread.wait;

public class Student extends Thread {

	@Override
	public void run() {
		try {
			// 책 빌린후 3초동안 읽고 반납
			String bookName = Static.library.rentalBook();
//			if(bookName == null) return;
			sleep(3000);
			Static.library.returnBook(bookName);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
}
