package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

	public static void main(String[] args) {
		char[] writeArr = {'A', 'B', 'C', 'D'};
		try(FileOutputStream file = new FileOutputStream("output.txt", true)) {
			for(char text: writeArr) {
				file.write(text);
			}
			file.write('1'); // valid
			file.write(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
