package com.testing;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService= Executors.newSingleThreadScheduledExecutor();

        for(int i=0;i<10;i++){
            System.out.println("Submitting task "+i +" "+new Date());
            LoopTask1 loopTask1= new LoopTask1("task");
            scheduledExecutorService.schedule(loopTask1, 20, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();


    }
}
