package classPart;

// 객체 정의만 함
public class Student {
	// 멤버변수
	public int studentId;
	public String studentName;
	public String address;
	
	// 메소드
	public void showStudentInfo () {
		System.out.println(studentName + ", " + address);
	}
}
