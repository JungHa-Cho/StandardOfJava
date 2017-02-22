package data_type;

public class Array_CJH {
	public static void main(String arg[]){
		int[] odds = { 1, 3, 5, 7, 9 };
		String[] week = { "월", "화", "수", "목", "금", "토", "일" };
		
		System.out.println(week[3]);
		
		for(int i = 0; i < week.length; i++)
		{
			System.out.println(week[i]);
		}
	}
}
