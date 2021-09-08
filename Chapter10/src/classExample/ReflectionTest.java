package classExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");
		
		Constructor[] constructors = stringClass.getConstructors();
		Method[] methods = stringClass.getMethods();
		
		for(Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("================================================");
		for(Method method : methods) {
			System.out.println(method);
		}
		
	}

}
