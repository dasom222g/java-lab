package staticExample;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student("Lee");
		Student kim = new Student("Kim");
		
		// System.out.println(lee.serialNum); // �̷��� ����ϴ°� ��������� �����ϴ°���
		System.out.println(Student.getSerialNum());
		
		lee.showStudentInfo();
		kim.showStudentInfo();
	}

}
