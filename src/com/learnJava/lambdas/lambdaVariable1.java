package com.learnJava.lambdas;

import java.util.function.Consumer;

public class lambdaVariable1 {
   static int value = 4;
   public static void main(String[] args) {
      //int i = 0;
      Consumer<Integer> c1 = ( i ) -> {
         System.out.println("Value is : "+ (value + i));
      };
      c1.accept(3);
   }
}
