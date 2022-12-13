package com.testing;

import java.util.Date;

public class LoopTask4 implements  Runnable{
    private String taskName;

    public LoopTask4(String taskName) {
        super();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started time for " + taskName + new Date());
            try{
                Thread.sleep(5000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName() + " ended time for " + taskName + new Date());

    }
}
