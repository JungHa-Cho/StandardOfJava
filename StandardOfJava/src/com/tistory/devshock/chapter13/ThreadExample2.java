/*package com.tistory.devshock.chapter13;

*//**
 * <pre>
 * 개인 프로젝트, Agent 실습 (After JDK 1.7)
 * 1. 클래스명 : ThreadExample2.java
 * 2. 작성일 : 2017. 2. 20.
 * 3. 작성자 : 조정하
 * 4. 설명 :  Stampled Lock이란? 읽기 Lock이 
 * 걸린 상태에서 쓰기 Lock이 진입하면 읽기 Lock이 바로 풀린다. 
 * 즉, 읽기와 쓰기가 충돌할때 Lock을 풀어버린다. 
 * 하지만 쓰기 중에는 쓰기가 끝난 후 읽기 Lock이 걸린다.
 * </pre>
 *//*
public class ThreadExample2{
    StampedLock lock = new StampedLock(); // JDK 1.8 부터
    int getBalance(){
        long stamp = lock.tryOptimisticRead();
        
        int curBalance = this.balance;
        
        if(lock.validate(stamp)) {
            stamp = lock.readLock();
            
            try{
                curBalance = this.getBalance();
            } finally {
                lock.unlockRead(stamp);
            }
        }
        
        return curBalance;
    }
    public static void main(String[] args){
        
    }
}*/