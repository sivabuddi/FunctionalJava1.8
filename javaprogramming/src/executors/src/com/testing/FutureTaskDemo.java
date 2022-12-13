package com.testing;

import java.util.concurrent.*;

public class FutureTaskDemo {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newScheduledThreadPool(10);
        AddTask addTask1= new AddTask(10,20);
        AddTask addTask2= new AddTask(40,50);
        AddTask addTask3= new AddTask(35,40);

        FutureTask<Integer> futureTask1= new FutureTask<>(addTask1);
        FutureTask<Integer> futureTask2= new FutureTask<>(addTask2);
        FutureTask<Integer> futureTask3 = new FutureTask<>(addTask3);

        executorService.submit(futureTask1);
        executorService.submit(futureTask2);
        executorService.submit(futureTask3);

        try{
            System.out.println("Future Task1 Output ="+futureTask1.get());
            System.out.println("Future Task2 output ="+futureTask2.get());
            System.out.println("Future Task3 output ="+futureTask3.get());
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }catch (ExecutionException ee){
            ee.printStackTrace();
        }

    }

}
