package thread.wait;

public class LibraryTest {

	public static void main(String[] args) {
		// thread »ı¼º
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		Student st6 = new Student();
		Student st7 = new Student();
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();
		st7.start();
	}

}
