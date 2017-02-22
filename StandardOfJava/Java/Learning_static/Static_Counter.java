package Learning_static;

public class Static_Counter {
	static int count = 0;
	
	Static_Counter() {
		this.count++;
		//System.out.println(this.count);
	}
	
	public static int getCount(){
		return count;
	}
	
	public static void main(String[] args) {
		Static_Counter c1 = new Static_Counter();
		Static_Counter c2 = new Static_Counter();
		
		System.out.println(Static_Counter.getCount());
	}
}
