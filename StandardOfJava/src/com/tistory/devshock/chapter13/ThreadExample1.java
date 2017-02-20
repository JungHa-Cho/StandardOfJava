package com.tistory.devshock.chapter13;

/**
 * <pre>
 * 개인 프로젝트, Agent 실습 (After JDK 1.7)
 * 1. 클래스명 : ThreadExample1.java
 * 2. 작성일 : 2017. 2. 20.
 * 3. 작성자 : 조정하
 * 4. 설명 :  Thread와 Run의 차이점
 * </pre>
 */
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