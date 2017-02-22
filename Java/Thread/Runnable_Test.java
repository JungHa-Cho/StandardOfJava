package Thread;

import java.util.ArrayList;

public class Runnable_Test implements Runnable {
	int seq;
	public Runnable_Test(int seq){
		this.seq = seq;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.seq + " Thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		System.out.println(this.seq+" thread end.");
	}
	
	public static void main(String[] args){
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 10; i ++){
			Thread t = new Thread(new Runnable_Test(i));
			t.start();
			threads.add(t);
		}
		
		for(int i = 0; i < threads.size(); i ++){
			Thread t = threads.get(i);
			try{
				t.join();
			}catch(Exception e){
				
			}
		}
		System.out.println("Main End.");
	}
}
