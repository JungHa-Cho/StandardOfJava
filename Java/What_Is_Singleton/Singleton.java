package What_Is_Singleton;

// static�� ������ ��ų�� �̿��� �̱��� ���� �ν��Ͻ� Return
class Single_ton{
	private static Single_ton one;
	private Single_ton(){
	}
	
	public static Single_ton getInstance() {
		if(one == null){
			one = new Single_ton();
		}
		return one;
	}
}

public class Singleton {
	public static void main(String[] args) {
		Single_ton singleton1 = Single_ton.getInstance();
		Single_ton singleton2 = Single_ton.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}
