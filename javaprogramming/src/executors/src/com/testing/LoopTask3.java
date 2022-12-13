package com.testing;

import java.util.Date;

public class LoopTask3 implements Runnable{

    private String taskName;

    public LoopTask3(String taskName) {
        super();
        this.taskName = taskName;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Start time for "+taskName + " "+ new Date());

        try{
            Thread.sleep(5000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "End time for "+ taskName + " "+new Date());
    }
}
