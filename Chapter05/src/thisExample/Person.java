package thisExample;

public class Person {
	private String name;
	private int age;
	
	public Person() { //기본생성자에서 아래의 생성자를 호출하여 초기화 함.
		this("이름없음", 1);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age);
	}
	
	public Person getThis() {
		return this;
	}
}
