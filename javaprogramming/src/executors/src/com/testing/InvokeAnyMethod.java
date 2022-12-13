package com.testing;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyMethod {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables= new HashSet<>();

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Task1");
                return "taks1";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Task2");
                return "task2";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Task3");
                return "task3";
            }
        });


        String result = null;

        try{
            result = executorService.invokeAny(callables);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }catch(ExecutionException ee){
            ee.printStackTrace();
        }

        System.out.println("Final result = "+result);
        executorService.shutdown();
    }

}
