package data_type;

public class number {
	public static void main(String arg[])
	{
		// ?��?��
		int age = 29;                              // -21?�� 4748�? 3648 �??�� ~ 21?�� 4748�? 3647 까�?
		long Count_Of_Second = 8124792317847912L;  //L ?��미사 ?��?��    // -922�? 3372�? 0368?�� 5477�? 5808 ~ 9223372036854775807
		
		// ?��?��
		float pi = 3.14F;
		double more_pi = 3.14159265358979323846;
		
		// �??��
		double e_1 = 123.4;
		double e_2 = 1.234e2;
		// e2?�� 10?�� ?���?(102102)?�� ?��미한?��. �? 1.234?��1021.234?��102 ?�� ?��?�� 123.4
		// e_1 == e_2
		
		// 16진수, 8진수
		int octal = 023;
		int hex = 0xC;
		
		int a = 7;
		int b = 3;
		int i = 0;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(--i);
	}
}
