package classExample;

public class Person {
	private String name;
	private int id;
	// »ý¼ºÀÚ
	public Person() {}
	public Person(String name) {
		setName(name);
	}
	public Person(String name, int id) {
		setName(name);
		setId(id);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
