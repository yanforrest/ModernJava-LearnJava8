package com.learnJava.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
   public static int  SumOfNNumber (List<Integer> integerList){
     return  integerList.stream()
         .reduce(0,(x,y)->x+y);
   }

   public static int sumOfNNumberIntStream(){
      return IntStream.rangeClosed(1,6)
         .sum();
   }

   public static void main(String[] args) {
      List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);

      System.out.println("Sum of Numeric Number" + SumOfNNumber(integerList));
      System.out.println("Sum of Numeric Number using IntStream " + sumOfNNumberIntStream());
   }

}
