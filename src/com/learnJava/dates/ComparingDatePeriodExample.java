package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatePeriodExample {
   public static void main(String[] args) {
      LocalDate localDate = LocalDate.of(2018,01,01);
      LocalDate localDate1 = LocalDate.of(2018,12, 31);

      /**
       *
       */
      Period period = localDate.until(localDate1);
      System.out.println("getDays : " + period.getDays());
      System.out.println("getMonths : " + period.getMonths());
      System.out.println("getYears : " + period.getYears());

      Period period1 = Period.ofDays(10);
      System.out.println("getDays : " + period1.getDays());

      Period period2 = Period.ofYears(10);
      System.out.println("getYears : " + period2.getYears());
      System.out.println("toTotalMonths : " + period2.toTotalMonths());

      Period period3 = Period.between(localDate,localDate1);
      System.out.println("Period: "+ period3.getDays() + " : " + period3.getMonths() + " : " + period3.getYears());

     // Period.between(LocalTime.now(),LocalTime.now().plusHours(24));


   }
}
