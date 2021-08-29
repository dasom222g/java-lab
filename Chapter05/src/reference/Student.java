package reference;

public class Student {
	int studentID;
	String studentName;
	boolean isValid;

	Subject korea;
	Subject math;
	
	public Student(int id, String name) { //�����ڿ��� subject�� �ʱ�ȭ
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setterSubject(String name, int score) {
		if (name == "korea") {
			korea.setterSubject(name, score);
			isValid = true;
		} else if (name == "math") {
			math.setterSubject(name, score);
			isValid = true;
		} else {
			isValid = false;
		}
	}
	
	public void showScore() {
		int koreaScore = korea.getterSubjectScore();
		int mathScore = math.getterSubjectScore();
		int total = koreaScore + mathScore;
		if (isValid) {
			System.out.println(studentName + "�л��� ���� ����: " + koreaScore + " ���� ����: " + mathScore);
			System.out.println(studentName + " �л��� �� ������ " + total + " �Դϴ�");
		} else System.out.println("��ȿ���� �ʽ��ϴ�.");
	}
}
