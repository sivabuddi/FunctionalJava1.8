package com.example;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ExecutorSubmitDemo {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(10);

        Runnable runnable=()->{

            try{
                TimeUnit.MILLISECONDS.sleep(10000);
                System.out.println("Current Time:: "+ LocalDateTime.now());
                System.out.println(Thread.currentThread().getName());
            }catch(Exception e){
                e.printStackTrace();
            }
        };

        // executor using execute
        executorService.execute(runnable);

        // executor using submit
        Future<String> result=executorService.submit(runnable, "DONE");

        while(result.isDone()==false){
            try{
                System.out.println("The method return value ="+result.get());
                break;
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }catch(ExecutionException ee){
                ee.printStackTrace();
            }

            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

        executorService.shutdown();

    }


}
