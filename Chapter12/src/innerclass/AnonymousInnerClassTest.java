package innerclass;

class AnonymouseOuter {
	public Runnable getRunnable(int i) {
		int num = 10;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				System.out.println("Runnable");
			}
		};
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Anonymouse Runnable");
		}
	};
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		AnonymouseOuter outer = new AnonymouseOuter();
		
		outer.getRunnable(200).run();
		outer.runnable.run();
	}

}
