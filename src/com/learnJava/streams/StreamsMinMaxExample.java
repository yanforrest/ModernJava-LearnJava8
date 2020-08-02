package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
   public  static int findMaxValue(List<Integer> integerList )
   {
      int result = integerList.stream()
         .reduce(0,(a,b) -> a>b ? a : b);

      return result;

   }
   public  static Optional<Integer> findMaxValueOptional(List<Integer> integerList )
   {
      Optional<Integer> result = integerList.stream()
         .reduce((a,b) -> a>b ? a : b);

      return result;

   }

   public  static int findMinValue(List<Integer> integerList )
   {
      int result = integerList.stream()
         .reduce(100,(a,b) -> a < b ? a : b);
      return result;

   }

   public  static Optional<Integer> findMinValueOptional(List<Integer> integerList )
   {
      Optional<Integer> result = integerList.stream()
         .reduce((a,b) -> a < b ? a : b);
      return result;

   }

   public static void main(String[] args) {

      List<Integer> integerList = Arrays.asList(6,7,8,9,10);
  //    List<Integer> integerList = new ArrayList<>();

      System.out.println("findMaxValue: " + findMaxValue(integerList));
      System.out.println("findMinValue: " + findMinValue(integerList));
      System.out.println("findMaxValueOptional: " + findMaxValueOptional(integerList));
      System.out.println("findMinValueOptional: " + findMinValueOptional(integerList));
   }
}
