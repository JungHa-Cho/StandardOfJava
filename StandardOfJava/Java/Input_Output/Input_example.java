package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStream - byte
//InputStreamReader - character
//BufferedReader - ¹®ÀÚ¿­

public class Input_example {
	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		String userInput = b.readLine();
		System.out.println("User Input :" + userInput);
	}
}
