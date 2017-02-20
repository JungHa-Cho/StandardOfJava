package com.tistory.devshock.chapter13;

public class ThreadExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample1_1 t1 = new ThreadExample1_1();
		
		Runnable r = new ThreadExample1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class ThreadExample1_1 extends Thread{
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(getName());
		}
	}
}

class ThreadExample1_2 implements Runnable{
	public void run(){
		for(int i = 0; i < 5; i++){
			// Thread.currentThread() - 현재 실행중인 쓰레드만 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}