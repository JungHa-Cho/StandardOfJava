package Object_Oriented;

public class HouseDog extends Dog {
	
	// ������
	public HouseDog(String name) {
		this.setName(name);
	}
	
	public HouseDog(int type) {
		if(type == 1) {
			this.setName("yorkshire");
		} else if (type == 2){
			this.setName("bulldog");
		}
	}
	
	public HouseDog() {
		
	}
	
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	
	public static void main(String[] args){
		HouseDog happy = new HouseDog("happy");
		HouseDog yorkshire = new HouseDog(1);
		
		System.out.println(happy.name);
		System.out.println(yorkshire.name);
	}
}

// ���� ��� ����
// �ڹٴ� ���߻���� �������� �ʴ´�.
// ���� ���� ���� ������ msg�� �켱������??
//
//class A {
//    public void msg() {
//        System.out.println("A message");
//    }
//}
//
//class B {
//    public void msg() {
//        System.out.println("B message");
//    }
//}
//
//class C extends A, B {
//    public void static main(String[] args) {
//        C test = new C();
//        test.msg();
//    }
//}