package classExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person personKim = new Person("김다솜");
		System.out.println(personKim);
		
		Class personClass = Class.forName("classExample.Person"); //클래스의 정보를 가져옴
		Person personPark = (Person) personClass.newInstance(); // 기본 생성자
		System.out.println(personPark);
		
		Class[] parmeterTypes = {String.class, int.class};
		Object[] initargs = {"이상순", 1000};
		Constructor constructors = personClass.getConstructor(parmeterTypes);
		Person personLee = (Person)constructors.newInstance(initargs);
		System.out.println("personLee: " + personLee + " id: " + personLee.getId());
	}

}
