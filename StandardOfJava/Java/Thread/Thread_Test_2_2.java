package Thread;

import java.util.ArrayList;

public class Thread_Test_2_2 extends Thread{
	int seq;
	public Thread_Test_2_2(int seq){
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq+" thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.seq+" thread end.");
	}
	
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 10; i ++){
			Thread t = new Thread_Test_2_2(i);
			t.start();
			threads.add(t);
		}
		
		for(int i = 0; i < threads.size(); i++){
			Thread t = threads.get(i);
			try{
				t.join(); 
				// 쓰레드가 꼭 종료된 후에 다음 로직 실행
				// 즉 Join은 쓰레드 종료될때까지 대기 타는 메소드
			}catch(Exception e){
				
			}
		}
		System.out.println("Main End.");
	}
}
