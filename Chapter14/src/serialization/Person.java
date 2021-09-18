package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static int serialNum = 1000;
	private String name;
	private String job;
	private transient int id;
	
	public Person(String name, String job) {
		setName(name);
		setJob(job);
		setID();
	}
	
	@Override
	public String toString() {
		return "name: " + name + " job: " + job + " ID: " + id;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public int getID() {
		return this.id;
	}
	private void setID() {
		serialNum += 1;
		this.id = serialNum;
	}
	
}
