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
		// 파라메터를 Object형으로 업캐스팅 되어 오기 때문에 구현부에서 다운캐스팅해야 인스턴스값에 접근가능
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
		Student lee = new Student(100, "이상일");
		Student sang = new Student(100, "이상일");
		
		System.out.println(lee == sang);
		System.out.println(lee.equals(sang));
		System.out.println("lee의 해시코드 " + lee.hashCode() + " sang의 해시코드 " + sang.hashCode());
		System.out.println("lee의 리얼 해시코드 " + System.identityHashCode(lee) + " sang의 리얼 해시코드 " + System.identityHashCode(sang));
		
		System.out.println("============");
		
		String str1 = "aaa1";
		String str2 = "aaa2";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
