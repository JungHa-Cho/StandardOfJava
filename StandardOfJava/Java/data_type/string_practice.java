package data_type;

public class string_practice {
	public static void main(String arg[]){
		String a = "a";
		String a1 = new String("a");
		
		System.out.println("Happy Java");
		System.out.println("a");
		System.out.println("c");
		
		//primitive(원시) 자료형
		//int, long, double, float, boolean, char
		//String은 표현식 사용 가능하도록 자바에서 특별대우, primitive는 아님
		boolean result = true;
		char capitalC = 'C';
		int i = 100000;
		
		//equals
		String aa = "hello";
		String bb = new String("hello");
		
		// 비교시 equals는 문자열 비교
		// == 은 객체가 같은 객체인지 판별함으로
		System.out.println(aa.equals(bb));
		System.out.println(aa == bb);
		
		// 특정 문자가 시작하는 곳
		String hello = "hello World";
		System.out.println(hello.indexOf("World"));
		
		// replaceAll
		String java = "Hello Java";
		System.out.println(java.replaceAll("Java", "kifk"));
		
		// substring 
		String aaa = "Hello Java";
		System.out.println(aaa.substring(0, 4));
		
		// toUpperCase
		String UpperCase = "Hello Java";
		System.out.println(UpperCase.toUpperCase());
	}
}
