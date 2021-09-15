package writerStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter outputFile = new FileWriter("writer.txt", true)) {
			outputFile.write('A');
			char[] buf = {'B', 'C', 'D', 'E'};
			outputFile.write(buf);
			outputFile.write("æ»≥Á«œººø‰.");
			outputFile.write(buf, 1, 2); // C, D
			outputFile.write(' ');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
