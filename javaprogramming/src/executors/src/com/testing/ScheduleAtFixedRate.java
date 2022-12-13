package com.testing;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRate {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(3);

        for(int i=0;i<5;i++){
            System.out.println("Submitting a Task " + i + " "+ new Date());
            LoopTask2 loopTask2 = new LoopTask2("task " + i);
            scheduledExecutorService.scheduleAtFixedRate(loopTask2,
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
