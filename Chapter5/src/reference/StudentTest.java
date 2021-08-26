package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setterSubject("korea", 100);
		studentLee.setterSubject("kkk", 99);
		
		studentLee.showScore();
		
		Student studentKim = new Student(100, "Kim");
		studentKim.setterSubject("korea", 60);
		studentKim.setterSubject("math", 44);
		
		studentKim.showScore();
	}

}
