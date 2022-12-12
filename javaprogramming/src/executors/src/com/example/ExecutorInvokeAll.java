package com.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorInvokeAll {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables= new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 1 completed";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 2 completed";
            }
        });


        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 3 completed";
            }
        });


        List<Future<String>> list=executorService.invokeAll(callables);

        for(Future<String> future:list)
            System.out.println(future.get());

        executorService.shutdown();

    }

}
