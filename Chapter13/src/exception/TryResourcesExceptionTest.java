package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResourcesExceptionTest {

	public static void main(String[] args) {
		try(FileInputStream file = new FileInputStream("a.txt")) {
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		}
	}

}
