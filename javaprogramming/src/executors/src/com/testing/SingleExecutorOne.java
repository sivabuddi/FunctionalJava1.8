package com.testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutorOne {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newSingleThreadExecutor();

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Single Thread Executor");
            }
        });

        executorService.shutdown();

    }// main


}// SingleExecutorOne
