package staticExample;

public class Student {
	//static����
	private static int serialNum = 1000;
	
	// ������� (�ν��Ͻ� ����)
	private int studentId;
	private String studentName;
	
	// ������
	public Student (String name) {
		studentName = name;
		Student.serialNum++;
		this.studentId = Student.serialNum;
	}
	
	// ��� �޼ҵ�
	public void showStudentInfo () {
		System.out.println("studentId: " + studentId + ", studentName: " + studentName);
	}
	
	// static�޼ҵ�
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	public static void staticRange() {
		// int i = 0; // ��������
		/// studentName = "Kim"; // �������
		Student studentLee = new Student("Lee");
		studentLee.studentName = "Kim";
	}
}
