package decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DecoratorTest {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
