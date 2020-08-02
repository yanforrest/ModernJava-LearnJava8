package com.learnJava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
   public static void main(String[] args) {
      LocalDate  localDate = LocalDate.now();
      System.out.println("localDate : " + localDate);

      LocalDate localDate1 = LocalDate.of(2020,8,2);
      System.out.println("localDate1 : " + localDate1);

      LocalDate localDate2 = LocalDate.ofYearDay(2020,365);
      System.out.println("localDate2 : " + localDate2);

      /**
       * Get values from localDate
       */
      System.out.println("getMonth " + localDate.getMonth());
      System.out.println("getMonthValue " + localDate.getMonthValue());
      System.out.println("getDayOfWeek " + localDate.getDayOfWeek());
      System.out.println("getDayOfYear " + localDate.getDayOfYear());

      System.out.println("Day of Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

      /**
       *  Modifying Local Date
       */
      System.out.println("plusDays: " + localDate.plusDays(20000));
      System.out.println("plusMonths: " + localDate.plusMonths(20000));
      System.out.println("minusDays: " + localDate.minusDays(20000));
      System.out.println("withYear: " + localDate.withYear(2019));
      System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2022));

      System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

      System.out.println("Chronounit minus : " + localDate.minus(200, ChronoUnit.DAYS));

      /**
       * Unsupported
       */
      //System.out.println("Chronounit minus : " + localDate.minus(200, ChronoUnit.MINUTES));
      System.out.println("Is supported : " + localDate.isSupported(ChronoUnit.MINUTES));
      /**
       * Additional Support Method
       */
      System.out.println("leapyear " + localDate.ofYearDay(2019,01).isLeapYear());
      // localDate = 01-August-2020
      // localDate1 = 02-August-2020
      System.out.println(localDate.isEqual(localDate1));
      System.out.println(localDate.isBefore(localDate1));
      System.out.println(localDate1.isAfter(localDate));
   }
}
