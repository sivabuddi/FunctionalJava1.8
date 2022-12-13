package com.testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for(int i=0;i<5;i++){
            LoopTask loopTask= new LoopTask("task "+i);
            executorService.submit(loopTask);
        }

        executorService.shutdown();

    }
}
