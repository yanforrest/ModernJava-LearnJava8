package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

   public static List<Student> filterStudents(){
      List<Student> studentList = StudentDataBase.getAllStudents().stream()
         .filter(student -> student.getGender() == "female")
         .filter(student -> student.getGpa() >= 3.9)
         .collect(Collectors.toList());
      return  studentList;
   }



   public static void main(String[] args) {
      System.out.println("filter Student : " + filterStudents());
      System.out.println("filter Student : ");
      filterStudents().forEach(System.out::println);
   }
}
