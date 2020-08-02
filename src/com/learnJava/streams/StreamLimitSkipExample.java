package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

   public static Optional<Integer> limit(List<Integer> integers)
   {
      Optional<Integer>  result = integers.stream()
         .limit(2)
         .reduce((a,b)->a+b);
      return result;

   }

   public static Optional<Integer> skip(List<Integer> integers)
   {
      Optional<Integer>  result = integers.stream()
         .skip(3)
         .reduce((a,b)->a+b);
      return result;

   }

   public static void main(String[] args) {
      List<Integer> integers = Arrays.asList(6,7,8,9,10);

      System.out.println("limit Integer Operation: " + limit(integers));
      System.out.println("skip Integer Operation: " + skip(integers));

   }
}
