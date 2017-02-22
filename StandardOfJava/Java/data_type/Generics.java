package data_type;

import java.util.ArrayList;

public class Generics {
	public static void main(String arg[]){
		// Generics를 사용하지 않으면 객체는 Object 자료형으로 인식된다.
		// 따라서 String으로 캐스팅(Casting)이 필요함
		// 또한 String 이외의 객체도 담을수 있기 때문에 형변환 과정에서 오류 발생 가능성이 있다.
		ArrayList bList = new ArrayList();
		bList.add("hello");
		bList.add("java");
		
		String hello = (String) bList.get(0);
		String java = (String) bList.get(1);
		
		// Generics
		// 자료형을 미리 선언해서 컴파일러가 미리 알고 있다.
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hello");
		aList.add("java");
		
		String Hello = aList.get(0);
		String Java = aList.get(1);
	}
}
