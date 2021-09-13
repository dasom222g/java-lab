package innerclass;

import innerclass.OutClass.InStaticClass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; // inner클래스 변수 선언
	
	OutClass() {
		inClass = new InClass(); // inner클래스 생성
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	// 내부 클래스
	class InClass {
		static int sInNum = 200;
		public void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	// 정적 내부 클래스
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 100;
		
		public void inTest() {
			System.out.println("=======멤버메소드 입니다=======");
//			System.out.println("num" + num);
			System.out.println("sNum" + sNum);
			System.out.println("inNum" + inNum);
			System.out.println("sInNum" + sInNum);
		}
		
		public static void sTest() {
//			System.out.println(inNum); // error
			System.out.println("=======static메소드 입니다=======");
			System.out.println("sInNum: " + sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		// 다른 파일에서 내부클래스 접근할 때(내부클래스가 private클래스가 아닐경우에만 가능)
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		System.out.println(OutClass.InClass.sInNum); // 200
		
		// 내부 정적 클래스 접근
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		inStaticClass.inTest(); // 멤버메소드 호출
		InStaticClass.sTest(); // static메소드 호출을 하므로 클래스이름으로 접근
	}

}
