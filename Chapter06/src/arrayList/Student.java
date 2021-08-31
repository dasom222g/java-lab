package arrayList;

import java.util.ArrayList;

public class Student {
	private static int serialNum = 1000;
	private int id;
	private String name;
	private ArrayList<Subject> subjectList;
	
	public Student(int id, String name) {
		setId(++serialNum);
		setName(name);
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int sum = 0;
		for(Subject subject : subjectList) {
			sum += subject.getScore();
			System.out.println("ID ���� " + id + "�� " + name + "�� " + subject.getName() + "������ ������ " + subject.getScore() + "�Դϴ�");
		}
		System.out.println(name + "���� ������ " + sum + "�� �Դϴ�.");
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
