package classPart;

public class StudentTest {
	
	public static void main(String[] args) {
		// 정의한 Student클래스 사용
		Student studentLee = new Student(); // 생성자 함수로 메모리에 생성됨
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 마포구";
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김다솜";
		studentKim.address = "서울시 동대문구";
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // heap메모리 주소값 출력됨
		System.out.println(studentKim);
	}

}
