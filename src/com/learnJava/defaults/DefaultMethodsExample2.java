package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

   private static Consumer<Student> studentConsumer = student -> System.out.println(student);
   private static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
   private static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);


   public static void sortByName(List<Student> studentList){
      System.out.println("After Sort Name");
      Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
      studentList.sort(nameComparator);
      studentList.forEach(studentConsumer);
   }


   public static void sortByGpa(List<Student> studentList){
      System.out.println("After Sort Gpa");
      Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
      studentList.sort(gpaComparator);
      studentList.forEach(studentConsumer);
   }

   public static void comparatorChaining(List<Student> studentList)
   {
      System.out.println("After Comparator chaining:");
      studentList.sort(gradeComparator.thenComparing(nameComparator));
      studentList.forEach(studentConsumer);

   }
   public static void sortWithNullValues(List<Student> studentList){
      System.out.println("After sortWithNullValues : ");
      Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
      studentList.sort(studentComparator);
      studentList.forEach(studentConsumer);
   }

   public static void main(String[] args) {
      List<Student> studentList = StudentDataBase.getAllStudents();
      System.out.println("Before Sort : ");
      studentList.forEach(studentConsumer);

      //sortByName(studentList);
      //sortByGpa(studentList);
      //comparatorChaining(studentList);
      sortWithNullValues(studentList);

   }
}
