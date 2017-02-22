package Object_Oriented;

// Call By Value, Call By Reference
// 객체가 넘어오면 속성 값 변경 가능
// 하지만 객체를 전달하는 것은 Call By Reference라기 보다는 엄밀히 말하자면
// 동일한 객체를 가리키는 또 다른 레퍼런스가 넘어가기 때문에 엄밀한 의미에서는
// Call By Value가 맞다.

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
