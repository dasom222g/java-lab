package test;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		String[] bookNamesLee = {"�¹���1", "�¹���2", "�¹���3"};
		
		Student studentKim = new Student("Kim");
		String[] bookNamesKim = {"����1", "����2", "����3"};
		
		Student studentCho = new Student("Cho");
		String[] bookNamesCho = {"�ظ�����1", "�ظ�����2", "�ظ�����3", "�ظ�����4", "�ظ�����5", "�ظ�����6"};
		
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
