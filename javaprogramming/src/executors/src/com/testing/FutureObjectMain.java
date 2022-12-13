package com.testing;

import java.util.concurrent.*;

public class FutureObjectMain {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(10);
        Future future_reference= executorService.submit(new Callable(){
            @Override
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return 1+2;
            }
        });

        try{
            System.out.println("Future Object value = "+future_reference.get());
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }catch(ExecutionException ee){
            ee.printStackTrace();
        }

    }

}
