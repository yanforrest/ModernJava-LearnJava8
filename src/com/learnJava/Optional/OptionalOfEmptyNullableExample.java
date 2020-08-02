package com.learnJava.Optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
   public static Optional<String> ofNullable(){
     Optional<String> stringOptional = Optional.ofNullable("hello");  // ofNullable(null)
     return stringOptional;
   }

   public static Optional<String> of(){
      Optional<String> stringOptional = Optional.of("Hello");  // of(null)
      return stringOptional;
   }
   public static Optional<String> empty(){
      Optional<String> stringOptional = Optional.empty();  // of(null)
      return stringOptional;
   }
   public static void main(String[] args) {
      System.out.println("ofNullable : " + ofNullable());
      System.out.println("of : " + of());
      System.out.println("empty : " + empty());
   }
}
