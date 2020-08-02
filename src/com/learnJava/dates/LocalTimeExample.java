package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
   public static void main(String[] args) {
      LocalTime localTime = LocalTime.now();
      System.out.println("localTime : " + localTime);

      LocalTime localTime1 = LocalTime.of(23,33);
      System.out.println("localTime1 : " + localTime1);

      LocalTime localTime2 = LocalTime.of(23,33,44);
      System.out.println("localTime2 : " + localTime2);

      LocalTime localTime3 = LocalTime.of(23,33,44, 980980980);
      System.out.println("localTime2 : " + localTime3);

      /**
       * getting the values from local time instance
       */
      System.out.println("getHour : " + localTime.getHour());
      System.out.println("getMinute : " + localTime.getMinute());
      System.out.println("CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
      System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());

      /**
       * Modify the values of LocalTime
       */
      System.out.println("minusHours : " + localTime.minusHours(2));
      System.out.println("ChronoUnit.HOURS : " + localTime.minus(2, ChronoUnit.HOURS));
      System.out.println("MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
      System.out.println("ChronoFile HOUR OF DAY : "
         + localTime.with(ChronoField.HOUR_OF_DAY,22));
      System.out.println("plusMinutes : "
         + localTime.plusMinutes(22));
      System.out.println("plus with ChronoUnit Minutes : "
         + localTime.plus(22,ChronoUnit.MINUTES));
      System.out.println("withhour : " + localTime.withHour(22));

   }
}
