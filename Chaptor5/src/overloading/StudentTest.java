package overloading;

public class StudentTest {
	
	public static void main(String[] args) {
		// ������ StudentŬ���� ���
		Student studentLee = new Student(100, "�̼���");
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "��ټ�");
		studentKim.showStudentInfo();
	}

}
