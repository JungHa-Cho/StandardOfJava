package com.tistory.devshock.executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest
{
    public static ThreadPoolExecutor execService;
    
    public static void main(String[] args)
    {
        execService = (ThreadPoolExecutor) Executors.newCachedThreadPool(); 
        
        execService.execute(new MyThreadTask2());
        execService.execute(new MyThreadTask2());
        
        execService.shutdown();
        
        System.out.println("Main thread ends here...");
    }
}

class MyThreadTask2 implements Runnable
{
    private static int count = 0;
    private int id;
    
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i ++)
        {
            System.out.println("<" + id + "> Tick Tick Count : " + i + "  Thread Count : " + ThreadPoolExecutorTest.execService.getActiveCount());
            try
            {
                TimeUnit.MICROSECONDS.sleep((long)Math.random() * 1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public MyThreadTask2()
    {
        this.id = ++count;
    }
}