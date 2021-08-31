package test;

import java.util.ArrayList;

public class Student {
	private static int serialNumber = 10000;
	
	private int id;
	private String name;
	private ArrayList<Book> bookList;
	
	public Student(String name) {
		setId(++serialNumber);
		setName(name);
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String bookName) {
		bookList.add(new Book(bookName));
	}
	
	public void showStudentInfo() {
		System.out.print("ID값이 " + id + "인 " +  name + "학생이 읽은 책은 ");
		for(int i = 0; i < bookList.size(); i++) {
			if (i == bookList.size() - 1) {
				System.out.print(bookList.get(i).getName());
				break;
			}
			System.out.print(bookList.get(i).getName() + ", ");
		}
//		for(Book book : bookList) {
//			System.out.print(book.getName() + ",");
//		}
		System.out.println(" 입니다.");
	}
	
	// getter, setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
