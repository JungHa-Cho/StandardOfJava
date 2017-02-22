package data_type;

import java.util.HashMap;

public class Map_To {
	public static void main(String arg[]){
		// Key, Value
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		System.out.println(map.get("people"));
		
		// containsKey, 해당 맵에 해당 키가 있는지 조사한다.
		System.out.println(map.containsKey("people"));
		
		System.out.println(map.remove("people"));
		System.out.println(map.size());
	}
}
