package com.learnJava.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingLocalDateExample {
   public static void parseLocalDate(){
      /**
       * String to a LocalDate
       */
      String date = "2018-04-28";
      LocalDate localDate = LocalDate.parse(date);
      System.out.println("localDate : " + localDate);
      LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
      System.out.println("localDate1 : " + localDate1);

      String date1 = "20180428";
      LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
      System.out.println("localDate2 : " + localDate2);

      /**
       *  custom defined dateformat
       */
      String date2= "2019|04|28";
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy|MM|dd");
      LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
      System.out.println("localDate3 : " + localDate3);

      String date3 = "2019*04*28";
      DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyy*MM*dd");
      LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);
      System.out.println("localDate4 : " + localDate4);
   }
   public static void formatLocalDate(){
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy*MM*dd");
      LocalDate localDate = LocalDate.now();
      String formattedDate = localDate.format(dateTimeFormatter);
      System.out.println("formattedDate : " + formattedDate);
   }
   public static void main(String[] args) {
      parseLocalDate();
      formatLocalDate();
   }
}
