package Thread;

public class Thread_Test extends Thread{
	public void run(){
		System.out.println("thread run.");
	}
	
	public static void main(String[] args){
		Thread_Test test = new Thread_Test();
		test.start();
	}
}
