package learning.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentThreadModificaiton extends  Thread{

    static ArrayList l = new ArrayList();

    public void run(){

        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){

        }
        System.out.println("Child try to update the list");
        l.add("D");
    }

    public static void main(String[] args) throws Exception{

        l.add("A");
        l.add("B");
        l.add("C");

        ConcurrentThreadModificaiton con = new ConcurrentThreadModificaiton();
        con.start();

        Iterator iterator=l.iterator();

        while(iterator.hasNext()){
            String s1=(String)iterator.next();
            System.out.println("Main thread iterating list and Current Object is ="+s1);
            Thread.sleep(3000);
        }

        System.out.println(l);



    }


}
