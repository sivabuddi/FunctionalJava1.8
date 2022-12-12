package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSubmit {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(5);

        executorService.submit(()->{
            System.out.println("Im on run method of Runnable Interface");
        });

        Future<Integer> future=executorService.submit(()->{
            return 1+1;
        });

        System.out.println(future.get());
        executorService.shutdown();

    }

}


