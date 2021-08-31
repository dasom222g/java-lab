package test;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		String[] bookNamesLee = {"태백산맥1", "태백산맥2", "태백산맥3"};
		
		Student studentKim = new Student("Kim");
		String[] bookNamesKim = {"토지1", "토지2", "토지3"};
		
		Student studentCho = new Student("Cho");
		String[] bookNamesCho = {"해리포터1", "해리포터2", "해리포터3", "해리포터4", "해리포터5", "해리포터6"};
		
		for (int i = 0; i < bookNamesLee.length; i++) {
			studentLee.addBook(bookNamesLee[i]);
			studentKim.addBook(bookNamesKim[i]);
		}
		for(String bookName : bookNamesCho) {
			studentCho.addBook(bookName);
		}
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
