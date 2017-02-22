package Learning_static;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String Get_Current_Data(String fmt){
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
	
	public static void main(String[] args) {
		System.out.println(Util.Get_Current_Data("yyy-MM-dd"));
	}
}
