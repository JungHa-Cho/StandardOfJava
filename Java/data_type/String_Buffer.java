package data_type;

public class String_Buffer {
	public static void main(String arg[]){
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Jump To Java");
		System.out.println(sb.toString());
		// StringBuffer�� Append�� �̿��� ���ڸ� ��� �߰��� ������ �ִ�.
		
		
        StringBuffer sb1 = new StringBuffer();
        sb1.append("jump to java");
        sb1.insert(0, "hello ");
        System.out.println(sb1.toString());
        
        
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello jump to java");
        System.out.println(sb2.substring(0, 4));
	}
}
