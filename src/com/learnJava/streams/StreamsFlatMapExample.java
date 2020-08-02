package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

   public static List<String> printStudentActivities(){
      List<String> studentActivities = StudentDataBase.getAllStudents()
         .stream()
         .map(Student::getActivities)//Stream<List<String>>
         .flatMap(List::stream)  //Stream<String>
         .distinct()
         .sorted()
         .collect(Collectors.toList());
      return studentActivities;
   }

   public static long getStudentActivitiesCount(){
      long  noOfStudentActivities = StudentDataBase.getAllStudents()
         .stream()
         .map(Student::getActivities)//Stream<List<String>>
         .flatMap(List::stream)  //Stream<String>
         .distinct()
         .count();
      return noOfStudentActivities;
   }

   public static void main(String[] args) {
      System.out.println("printStudentActivities : " + printStudentActivities());
      System.out.println("getStudentActivitiesCount : " + getStudentActivitiesCount());
   }
}
