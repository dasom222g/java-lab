package reference;

public class Subject {
//	private int subjectID;
	private String name;
	private int score;
	
	public void setterSubject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getterSubjectName() {
		return name;
	}
	public int getterSubjectScore() {
		return score;
	}
	
}
