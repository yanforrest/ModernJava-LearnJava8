package com.learnJava.lambdas;

public class RunnableLambdaExample {
   public static void main(String[] args) {
      /**
       * Prior Java 8
       */
      Runnable runnable = new Runnable() {
         @Override
         public void run() {
            System.out.println("Inside Runnable 1");
         }
      };
      new Thread (runnable).start();
      //java 8 lambda
      //()->{}
      Runnable runnableLambda = ()->{
         System.out.println("inside Runnable 2");
      };

      Runnable runnableLambda1 = ()-> System.out.println("inside Runnable 3");

      new Thread(runnableLambda).start();
      new Thread(runnableLambda1).start();

      new Thread(new Runnable() {
         @Override
         public void run() {
            System.out.println("Inside Runnable 3.1");
         }
      }).start();
      new Thread(()->System.out.println("inside Runnable 4")).start();
   }
}
