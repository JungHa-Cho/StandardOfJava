package data_type;

import java.util.ArrayList;

public class Generics {
	public static void main(String arg[]){
		// Generics�� ������� ������ ��ü�� Object �ڷ������� �νĵȴ�.
		// ���� String���� ĳ����(Casting)�� �ʿ���
		// ���� String �̿��� ��ü�� ������ �ֱ� ������ ����ȯ �������� ���� �߻� ���ɼ��� �ִ�.
		ArrayList bList = new ArrayList();
		bList.add("hello");
		bList.add("java");
		
		String hello = (String) bList.get(0);
		String java = (String) bList.get(1);
		
		// Generics
		// �ڷ����� �̸� �����ؼ� �����Ϸ��� �̸� �˰� �ִ�.
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hello");
		aList.add("java");
		
		String Hello = aList.get(0);
		String Java = aList.get(1);
	}
}
