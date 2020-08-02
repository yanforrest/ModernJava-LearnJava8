package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
   public static List<Student> sortStudentsByName(){
      List<Student> studentList = StudentDataBase.getAllStudents().stream()
         .sorted(Comparator.comparing(Student::getName))
         .collect(Collectors.toList());
      return  studentList;
   }
   public static List<Student> sortStudentsByGpa(){
      List<Student> studentList = StudentDataBase.getAllStudents().stream()
         .sorted(Comparator.comparing(Student::getGpa))
         .collect(Collectors.toList());
      return  studentList;
   }
   public static List<Student> sortStudentsByGpaDesc(){
      List<Student> studentList = StudentDataBase.getAllStudents().stream()
         .sorted(Comparator.comparing(Student::getGpa).reversed())
         .collect(Collectors.toList());
      return  studentList;
   }
   public static void main(String[] args) {
      System.out.println("Sort Student by Name : " + sortStudentsByName());
      System.out.println("Sort Student by Name : ");
         sortStudentsByName().forEach(System.out::println);
      System.out.println("Sort Student by Gpa : ");
         sortStudentsByGpa().forEach(System.out::println);
      System.out.println("Sort Student by Gpa Desc : ");
          sortStudentsByGpaDesc().forEach(System.out::println);
   }
}
