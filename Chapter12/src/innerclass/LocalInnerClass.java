package innerclass;

class Outer {
	public int outNum = 10;
	public static int sNum = 100;
	public Runnable getRunnable(int i) {
		int num = 10;
		
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				// num += 50; // error
				System.out.println(num);
				System.out.println(i);
				System.out.println("Runnable");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(200);
		runnable.run();
		outer.getRunnable(200).run();
	}

}
