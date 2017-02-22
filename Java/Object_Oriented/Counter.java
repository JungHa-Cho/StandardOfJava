package Object_Oriented;

// Call By Value, Call By Reference
// ��ü�� �Ѿ���� �Ӽ� �� ���� ����
// ������ ��ü�� �����ϴ� ���� Call By Reference��� ���ٴ� ������ �����ڸ�
// ������ ��ü�� ����Ű�� �� �ٸ� ���۷����� �Ѿ�� ������ ������ �ǹ̿�����
// Call By Value�� �´�.

class Updator {
	public void update(Counter counter){
		counter.count++;
	}
}

public class Counter {
	int count = 0;
	public static void main(String[] args){
		Counter myCounter = new Counter();
		System.out.println("before update:"+myCounter.count);
		
		Updator myUpdator = new Updator();
		myUpdator.update(myCounter);
		System.out.println("after update:"+myCounter.count);
	}
}
