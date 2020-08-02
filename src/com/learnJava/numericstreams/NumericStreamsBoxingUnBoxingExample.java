package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnBoxingExample {
   public static List<Integer> boxing(){
      return IntStream.rangeClosed(1,10)
         // int
         .boxed()
         //Integer
         .collect(Collectors.toList());

   }

   public static int unBoxing(List<Integer> integerList)
   {
      return integerList.stream()
         //wrapper Integer Values
         .mapToInt(Integer::intValue)
         .sum();
   }
   public static void main(String[] args) {
      System.out.println("Boxing:  " + boxing());
      List<Integer> integerList = boxing();
      System.out.println("Unboxing: " + unBoxing(integerList));
   }
}
