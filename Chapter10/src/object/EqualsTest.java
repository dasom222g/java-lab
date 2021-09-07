package object;

class Student {
	public int studentNum;
	public String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// �Ķ���͸� Object������ ��ĳ���� �Ǿ� ���� ������ �����ο��� �ٿ�ĳ�����ؾ� �ν��Ͻ����� ���ٰ���
		if (obj instanceof Student) {
			Student copy = (Student)obj;
			return this.studentNum == copy.studentNum;
		}
		else return false;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.studentNum;
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Student lee = new Student(100, "�̻���");
		Student sang = new Student(100, "�̻���");
		
		System.out.println(lee == sang);
		System.out.println(lee.equals(sang));
		System.out.println("lee�� �ؽ��ڵ� " + lee.hashCode() + " sang�� �ؽ��ڵ� " + sang.hashCode());
		System.out.println("lee�� ���� �ؽ��ڵ� " + System.identityHashCode(lee) + " sang�� ���� �ؽ��ڵ� " + System.identityHashCode(sang));
		
		System.out.println("============");
		
		String str1 = "aaa1";
		String str2 = "aaa2";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
