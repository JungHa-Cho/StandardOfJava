package Input_Output;

import java.io.FileWriter;
import java.io.IOException;

public class Output_file_txt_3 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:/Users/nano_planning/Desktop/out.txt");
		for(int i = 1; i < 11; i++)
		{
			String data = i + " ��° ���Դϴ�. \r\n";
			fw.write(data);
		}
		fw.close();
	}
}
