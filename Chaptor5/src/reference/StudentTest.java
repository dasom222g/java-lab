package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 99);
		
		studentLee.showScore();
		
		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreaSubject("����", 60);
		studentKim.setMathSubject("����", 44);
		
		studentKim.showScore();
	}

}
