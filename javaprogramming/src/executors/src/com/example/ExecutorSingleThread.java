package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSingleThread {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("In ExecutorService Interface");
            }
        });

        executorService.shutdown();
    }
}
