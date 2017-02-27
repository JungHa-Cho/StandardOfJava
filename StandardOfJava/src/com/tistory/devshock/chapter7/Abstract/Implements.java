package com.tistory.devshock.chapter7.Abstract;

abstract class Player {
    boolean pause;
    int currentPos;
    
    Player() {
        pause = false;
        currentPos = 0;
    }
    /** 지정된 위치(POS)에서 실행되는 기능 구현 **/
    abstract void play(int pos);
    /** 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다, **/
    abstract void stop();
    /** 추상 메서드를 사용할 수 있다. **/
    void play(){
        play(currentPos);
    }
    
    void pause(){
        if(pause) {
            pause = false;
            play(currentPos);
        }else{
            pause = true;
            stop();
        }
    }
}

class CDPlayer extends Player {
    @Override
    void play(int pos)
    {
        // TODO Auto-generated method stub
        // abstract 구현체, 내용 생략
    }

    @Override
    void stop()
    {
        // TODO Auto-generated method stub
        // abstract 구현체, 내용 생략
    }
    
    int currentTrack;
    
    void nextTrack() {
        currentTrack++;
    }
    
    void preTrack() {
        currentTrack--;
    }
}

public class Implements
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
    }

}
