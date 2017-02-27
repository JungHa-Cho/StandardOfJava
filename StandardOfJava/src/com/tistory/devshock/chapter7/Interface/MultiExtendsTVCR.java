package com.tistory.devshock.chapter7.Interface;

class TV {
    protected boolean power;
    protected int channel;
    protected int volume;
    
    public void power()         { power = ! power;  }
    public void channelUp()     { channel++;        }
    public void channelDown()   { channel--;        }
    public void volumeUp()      { volume++;         }
    public void volumeDown()    { volume--;         }
}

class VCR {
    protected int counter;      // VCR의 카운터
    
    public void play() {
        // tape를 재생한다.
    }
    
    public void stop() {
        // 재생을 멈춘다
    }
    
    public void reset() {
        counter = 0;
    }
    
    public int getCounter() {
        return counter;
    }
    
    public void setCounter(int c) {
        counter = c;
    }
}

interface IVCR {
    public void play();
    public void stop();
    public void reset();
    public int getCounter();
    public void setCounter(int c);
}

public class MultiExtendsTVCR extends TV implements IVCR
{
    VCR vcr = new VCR();
    
    @Override
    public void play()
    {
        // TODO Auto-generated method stub
        vcr.play();
    }

    @Override
    public void stop()
    {
        // TODO Auto-generated method stub
        vcr.stop();
    }

    @Override
    public void reset()
    {
        // TODO Auto-generated method stub
        vcr.reset();
    }

    @Override
    public int getCounter()
    {
        // TODO Auto-generated method stub
        return vcr.getCounter();
    }

    @Override
    public void setCounter(int c)
    {
        // TODO Auto-generated method stub
        vcr.setCounter(c);
    }
    
}
