package com.testing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllMethod {

    public static void main(String[] args) throws Exception {

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables= new HashSet<>();

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("In task 1");
                return "Task1";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("In task 2");
                return "Task2";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("In task 3");
                return "Task3";
            }
        });


        List<Future<String>> future=executorService.invokeAll(callables);

        for(Future future1:future){
            System.out.println(" Future Object Values = "+future1.get());
        }

        executorService.shutdown();

    }// main

}
