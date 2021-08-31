package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student studentKim = new Student(1, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		
		Student studentLee = new Student(2, "Lee");
		studentLee.addSubject("외국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.addSubject("영어", 80);
		
		studentKim.showStudentInfo();
		System.out.println("==============");
		studentLee.showStudentInfo();
	}

}
