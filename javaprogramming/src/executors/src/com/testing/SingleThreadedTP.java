package com.testing;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadedTP {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i=0;i<5;i++){
            System.out.println("Submitting task " + i + " " + new Date());
            LoopTask4 loopTask4 = new LoopTask4("task "+i);
            executorService.submit(loopTask4);
        }

        try{
            Thread.sleep(30000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        executorService.shutdown();
    }

}
