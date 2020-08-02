package com.learnJava.parallelstream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

   public static int sequentialSum(List<Integer> integerList)
   {
      long startTime = System.currentTimeMillis();
      int sum = integerList
         .stream()
         .reduce(0, (x, y) -> x+y);
      long endTime = System.currentTimeMillis();
      long duration = endTime - startTime;
      System.out.println("Duration in Sequential Stream : " + duration);

      return sum;
   }

   public static int parallelSum(List<Integer> integerList)
   {
      long startTime = System.currentTimeMillis();
      int sum = integerList
                  .parallelStream()
         .reduce(0, (x, y) -> x+y); // perform the unboxing from Integer to int
      long endTime = System.currentTimeMillis();
      long duration = endTime - startTime;
      System.out.println("Duration in Parallel Stream : " + duration);

      return sum;
   }

   public static void main(String[] args) {

      List<Integer> integerList =IntStream.rangeClosed(1, 10000)
         .boxed()
         .collect(Collectors.toList());
      System.out.println(sequentialSum(integerList));
      System.out.println(parallelSum(integerList));

   }
}
