package overloading;

// ��ü ���Ǹ� ��
public class Student {
	// �������
	private int studentId;
	private String studentName;
	
	// ������
	public Student (int id, String name) { // id�� name���� �޴� ������
		studentId = id;
		studentName = name;
	}
	
	public Student (int id) { // id���� �޴� ������
		studentId = id;
	}
	
	// �޼ҵ�
	public void showStudentInfo () {
		System.out.println("studentId: " + studentId + "studentName: " + studentName);
	}
}
