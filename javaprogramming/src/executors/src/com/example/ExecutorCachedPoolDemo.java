package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCachedPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newCachedThreadPool();

        List<Callable<Integer>> callables= Arrays.asList(
                () -> 1,
                () -> 2,
                () -> 3
        );

        try{

            List<Future<Integer>> futures = executorService.invokeAll(callables);

            int sum = futures.stream().map(
                    f ->{
                        try{
                            return f.get();
                        }catch(Exception e){
                           throw new IllegalStateException(e);
                        }
                    }
            ).mapToInt(Integer::intValue).sum();
            System.out.println(sum);

        }catch(InterruptedException exception){
            exception.printStackTrace();
        }finally {
            executorService.shutdown();
        }


    }

}
