package com.example;
// https://www.educative.io/courses/java-8-lambdas-stream-api-beyond/R888OpmM5WO
public class ABUser implements A, B{
    @Override
    public void printValue() {
      //  System.out.println("Im user AB in 2050");
     //   A.super.printValue();
    }

    public static void main(String[] args) {
        ABUser abUser=new ABUser();
        abUser.printValue();

    }
}
