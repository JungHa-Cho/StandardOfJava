package com.tistory.devshock.common;

/** 전달 받은 i를 증감 시켜주는 Updator **/
class Updator{
    public void Increase(int i){
        i++;
    }
}

/** Count 변수를 가지고 있는 Counter 객체 **/
public class Counter
{
    int count = 0;
    public static void main(String[] args)
    {
        Counter myCounter = new Counter();
        System.out.println("before i : "+myCounter.count);
        
        Updator updator = new Updator();
        updator.Increase(myCounter.count);
        System.out.println("after i : "+myCounter.count);
    }

}
