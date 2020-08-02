package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
   public static void main(String[] args) {
      //Local Date
      LocalDate localDate = LocalDate.now();
      System.out.println("LocalDate : " + localDate);
      // Local Time
      LocalTime localTime = LocalTime.now();
      System.out.println("LocalTime : " + localTime);
      //LocalDateTime
      LocalDateTime localDateTime = LocalDateTime.now();
      System.out.println("LocalDateTime : " + localDateTime);
   }
}
