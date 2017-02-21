package com.tistory.devshock.common;

/** 전달 받은 i를 증감 시켜주는 Updator **/
class Updator2{
    public void Increase(Counter2 i){
        i.count++;
    }
}

/** Count 변수를 가지고 있는 Counter 객체 **/
public class Counter2
{
    int count = 0;
    public static void main(String[] args)
    {
        Counter2 myCounter = new Counter2();
        System.out.println("before i : "+myCounter.count);
        
        Updator2 updator = new Updator2();
        updator.Increase(myCounter);
        System.out.println("after i : "+myCounter.count);
    }

}