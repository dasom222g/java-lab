package overloading;

public class StudentTest {
	
	public static void main(String[] args) {
		// 정의한 Student클래스 사용
		Student studentLee = new Student(100, "이순신");
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "김다솜");
		studentKim.showStudentInfo();
	}

}
