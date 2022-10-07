package learning.concurrentcollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;

public class ConcurrentHashMapEx2 extends Thread{

    static ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap();

    public void run(){

        try{
            Thread.sleep(2000);

        }catch(InterruptedException ie){}
        System.out.println("Child Thread updating the ConcurrentHashMap");
        concurrentHashMap.put(103,"D");
    }


    public static void main(String[] args) throws Exception {

        concurrentHashMap.put(101,"A");
        concurrentHashMap.put(102,"B");

        ConcurrentHashMapEx2 concurrentHashMapEx2 =new ConcurrentHashMapEx2();
        concurrentHashMapEx2.start();

        Set set = concurrentHashMap.keySet();
        Iterator iterator=set.iterator();

        while(iterator.hasNext()){
            Integer i1=(Integer)iterator.next();
            System.out.println("Main Thread Iterating Map and Current Entry is "+ i1 + "..."+concurrentHashMap.get(i1));
            Thread.sleep(3000);
        }

        System.out.println(concurrentHashMap);
    }
}
