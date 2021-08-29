package thisExample;

public class PersonTest {

	public static void main(String[] args) {
		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personLee = new Person("Lee", 40);
		Person personLeeMemory = personLee.getThis();
		personLee.showInfo();
		
		System.out.println(personLee);
		System.out.println(personLeeMemory);
	}

}
