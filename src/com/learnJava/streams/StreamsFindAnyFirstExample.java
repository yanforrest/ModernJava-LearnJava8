package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
   public static Optional<Student> findAnyStudent(){
      return StudentDataBase.getAllStudents().stream()
         .filter(student -> student.getGpa()>=3.9)
         //.peek(System.out::println)
         .findAny();
   }
   public static Optional<Student> findFirstStudent(){
      return StudentDataBase.getAllStudents().stream()
         .filter(student -> student.getGpa()>=4.1)
         .peek(System.out::println)
         .findFirst();
   }

   public static void main(String[] args) {
      Optional<Student> optionalStudentFindAny= findAnyStudent();

      if(optionalStudentFindAny.isPresent())
         System.out.println("findAnyStudent : " + optionalStudentFindAny.get());
      else
         System.out.println("Student not found !");

      Optional<Student> optionalStudentFindFirst= findFirstStudent();
      if(optionalStudentFindFirst.isPresent())
         System.out.println("findFirstStudent : " + optionalStudentFindFirst.get());
      else
         System.out.println("Student not found !");
   }
}
