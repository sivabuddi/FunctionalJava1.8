package com.testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){
            LoopTask loopTask= new LoopTask("task "+i);
            executorService.submit(loopTask);
        }

        executorService.shutdown();

    }

}
