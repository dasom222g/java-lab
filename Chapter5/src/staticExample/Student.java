package staticExample;

public class Student {
	//static변수
	private static int serialNum = 1000;
	
	// 멤버변수 (인스턴스 변수)
	private int studentId;
	private String studentName;
	
	// 생성자
	public Student (String name) {
		studentName = name;
		Student.serialNum++;
		this.studentId = Student.serialNum;
	}
	
	// 멤버 메소드
	public void showStudentInfo () {
		System.out.println("studentId: " + studentId + ", studentName: " + studentName);
	}
	
	// static메소드
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	public static void staticRange() {
		// int i = 0; // 지역변수
		/// studentName = "Kim"; // 멤버변수
		Student studentLee = new Student("Lee");
		studentLee.studentName = "Kim";
	}
}
