package data_type;

public class string_practice {
	public static void main(String arg[]){
		String a = "a";
		String a1 = new String("a");
		
		System.out.println("Happy Java");
		System.out.println("a");
		System.out.println("c");
		
		//primitive(����) �ڷ���
		//int, long, double, float, boolean, char
		//String�� ǥ���� ��� �����ϵ��� �ڹٿ��� Ư�����, primitive�� �ƴ�
		boolean result = true;
		char capitalC = 'C';
		int i = 100000;
		
		//equals
		String aa = "hello";
		String bb = new String("hello");
		
		// �񱳽� equals�� ���ڿ� ��
		// == �� ��ü�� ���� ��ü���� �Ǻ�������
		System.out.println(aa.equals(bb));
		System.out.println(aa == bb);
		
		// Ư�� ���ڰ� �����ϴ� ��
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
