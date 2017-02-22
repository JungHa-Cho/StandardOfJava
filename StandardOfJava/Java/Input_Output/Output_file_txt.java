package Input_Output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Output_file_txt {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:/Users/nano_planning/Desktop/out.txt");
		PrintStream printOut = new PrintStream(output);
		
		System.setOut(printOut);
		System.out.println("hello world");
		
		output.close();
	}
}
