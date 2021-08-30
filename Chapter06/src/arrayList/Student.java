package arrayList;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int sum = 0;
		for(Subject subject : subjectList) {
			sum += subject.getScore();
			System.out.println(name + "님 " + subject.getName() + "과목의 성적은 " + subject.getScore() + "입니다");
		}
		System.out.println(name + "님의 총점은 " + sum + "점 입니다.");
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
