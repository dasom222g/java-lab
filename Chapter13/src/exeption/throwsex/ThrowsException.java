package exeption.throwsex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException  {
		FileInputStream file = new FileInputStream(fileName);
		Class loadingClass = Class.forName(className);
		return loadingClass;
	}
}
