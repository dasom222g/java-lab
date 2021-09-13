package innerclass;

import innerclass.OutClass.InStaticClass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; // innerŬ���� ���� ����
	
	OutClass() {
		inClass = new InClass(); // innerŬ���� ����
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	// ���� Ŭ����
	class InClass {
		static int sInNum = 200;
		public void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	// ���� ���� Ŭ����
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 100;
		
		public void inTest() {
			System.out.println("=======����޼ҵ� �Դϴ�=======");
//			System.out.println("num" + num);
			System.out.println("sNum" + sNum);
			System.out.println("inNum" + inNum);
			System.out.println("sInNum" + sInNum);
		}
		
		public static void sTest() {
//			System.out.println(inNum); // error
			System.out.println("=======static�޼ҵ� �Դϴ�=======");
			System.out.println("sInNum: " + sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		// �ٸ� ���Ͽ��� ����Ŭ���� ������ ��(����Ŭ������ privateŬ������ �ƴҰ�쿡�� ����)
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		System.out.println(OutClass.InClass.sInNum); // 200
		
		// ���� ���� Ŭ���� ����
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		inStaticClass.inTest(); // ����޼ҵ� ȣ��
		InStaticClass.sTest(); // static�޼ҵ� ȣ���� �ϹǷ� Ŭ�����̸����� ����
	}

}
