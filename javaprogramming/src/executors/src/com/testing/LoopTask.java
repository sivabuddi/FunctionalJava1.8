package com.testing;

public class LoopTask implements  Runnable{

    private String taskName;

    public LoopTask(String taskName) {
        super();
        this.taskName = taskName;
    }

    @Override
    public void run() {

        for(int i=0;i<10;i++) {
            System.out.println("Executing " + taskName + "with " + Thread.currentThread().getName());

        }
        System.out.println("-------------------");
        System.out.println("Ending "+taskName);
    }
}
