package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {
   public static int sum(){
      return StudentDataBase.getAllStudents().stream()
         .collect(summingInt(Student::getNoteBooks));
   }
   public static double average(){
      return StudentDataBase.getAllStudents().stream()
         .collect(averagingInt(Student::getNoteBooks));
   }
   public static void main(String[] args) {
      System.out.println("Total No of Notebooks: " + sum());
      System.out.println("Average No of Notebooks: " + average());
   }
}
