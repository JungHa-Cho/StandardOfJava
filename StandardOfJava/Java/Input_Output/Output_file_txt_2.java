package Input_Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output_file_txt_2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:/Users/nano_planning/Desktop/out.txt");
		for(int i = 0; i < 11; i ++){
			String data = i+" 번째 줄입니다. \r\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}
