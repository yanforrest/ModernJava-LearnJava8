package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
   public static void main(String[] args) {
      //student name and there activities in a map
      Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
      Predicate<Student> studentgpaPredicate = (student -> student.getGpa() >=3.9);

      Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
                     .peek(student -> {
                        System.out.println(student);
                     })
                     .filter(studentPredicate)
                     .peek(student -> {
                        System.out.println("after 1 st filter " + student);
                     })
                     .filter(studentgpaPredicate)
                     .peek(student -> {
                        System.out.println("after 2 nd filter " + student);
                     })
                     .collect(Collectors.toMap(Student::getName, Student::getActivities));

      System.out.println(studentMap);
   }
}
