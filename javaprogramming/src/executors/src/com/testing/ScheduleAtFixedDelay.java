package com.testing;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedDelay {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(3);

        for(int i=0;i<5;i++){
            System.out.println("Submitting a Task " + i + " "+ new Date());
            LoopTask3 loopTask3 = new LoopTask3("task " + i);
            scheduledExecutorService.scheduleWithFixedDelay(loopTask3,
                    20,
                    5,
                    TimeUnit.SECONDS);

        }

        try{
            Thread.sleep(30000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    scheduledExecutorService.shutdown();


    }


}
