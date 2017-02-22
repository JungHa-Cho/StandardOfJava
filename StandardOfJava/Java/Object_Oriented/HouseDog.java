package Object_Oriented;

public class HouseDog extends Dog {
	
	// 생성자
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

// 다중 상속 예제
// 자바는 다중상속을 지원하지 않는다.
// 만약 밑의 예제 같을때 msg의 우선순위는??
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