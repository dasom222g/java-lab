package classPart;

public class StudentTest {
	
	public static void main(String[] args) {
		// ������ StudentŬ���� ���
		Student studentLee = new Student(); // ������ �Լ��� �޸𸮿� ������
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ������";
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "��ټ�";
		studentKim.address = "����� ���빮��";
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // heap�޸� �ּҰ� ��µ�
		System.out.println(studentKim);
	}

}
