package data_type;

import java.util.HashMap;

public class Map_To {
	public static void main(String arg[]){
		// Key, Value
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "���");
		map.put("baseball", "�߱�");
		
		System.out.println(map.get("people"));
		
		// containsKey, �ش� �ʿ� �ش� Ű�� �ִ��� �����Ѵ�.
		System.out.println(map.containsKey("people"));
		
		System.out.println(map.remove("people"));
		System.out.println(map.size());
	}
}
