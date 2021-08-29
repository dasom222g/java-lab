package reference;

public class Student {
	int studentID;
	String studentName;
	boolean isValid;

	Subject korea;
	Subject math;
	
	public Student(int id, String name) { //생성자에서 subject값 초기화
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
			System.out.println(studentName + "학생의 국어 점수: " + koreaScore + " 수학 점수: " + mathScore);
			System.out.println(studentName + " 학생의 총 점수는 " + total + " 입니다");
		} else System.out.println("유효하지 않습니다.");
	}
}
