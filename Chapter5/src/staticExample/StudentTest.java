package staticExample;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student("Lee");
		Student kim = new Student("Kim");
		
		// System.out.println(lee.serialNum); // 이렇게 사용하는건 멤버변수에 접근하는것임
		System.out.println(Student.getSerialNum());
		
		lee.showStudentInfo();
		kim.showStudentInfo();
	}

}
