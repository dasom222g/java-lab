package overloading;

// 객체 정의만 함
public class Student {
	// 멤버변수
	private int studentId;
	private String studentName;
	
	// 생성자
	public Student (int id, String name) { // id와 name값을 받는 생성자
		studentId = id;
		studentName = name;
	}
	
	public Student (int id) { // id값만 받는 생성자
		studentId = id;
	}
	
	// 메소드
	public void showStudentInfo () {
		System.out.println("studentId: " + studentId + "studentName: " + studentName);
	}
}
