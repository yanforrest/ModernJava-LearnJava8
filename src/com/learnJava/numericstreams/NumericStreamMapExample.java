package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
   public static List<Integer> mapToObj()
   {
      return IntStream.rangeClosed(1,5)
         .mapToObj(value ->{
            return new Integer(value);
         }).collect(Collectors.toList());
   }
   public static Long mapToLong(){
      return IntStream.rangeClosed(1,5)
         .mapToLong(value->value).sum();
   }
   public static Double mapToDouble(){
      return IntStream.rangeClosed(1,5)
         .mapToDouble(value->value).sum();
   }

   public static void main(String[] args) {
      System.out.println("Map to Obj : " + mapToObj());
      System.out.println("Map to Long : " + mapToLong());
      System.out.println("Map to Double : " + mapToDouble());
   }
}
