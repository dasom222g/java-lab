package classExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person personKim = new Person("��ټ�");
		System.out.println(personKim);
		
		Class personClass = Class.forName("classExample.Person"); //Ŭ������ ������ ������
		Person personPark = (Person) personClass.newInstance(); // �⺻ ������
		System.out.println(personPark);
		
		Class[] parmeterTypes = {String.class, int.class};
		Object[] initargs = {"�̻��", 1000};
		Constructor constructors = personClass.getConstructor(parmeterTypes);
		Person personLee = (Person)constructors.newInstance(initargs);
		System.out.println("personLee: " + personLee + " id: " + personLee.getId());
	}

}
