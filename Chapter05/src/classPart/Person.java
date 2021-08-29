package classPart;

public class Person {
	public int age;
	public String name;
	public boolean isMarried;
	public int numberOfChild;
	String married;
	
	public void showInfo() {
		married = isMarried ? "±‚»•" : "πÃ»•";
		System.out.println(age + name + married + numberOfChild);
	}
}
