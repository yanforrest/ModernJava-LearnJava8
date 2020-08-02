package com.learnJava.methodreference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

   static Consumer<Student> c1 = System.out::println;

   /**
    *  Classname::instanceMethodName
    */
   static Consumer<Student> c2 = Student::printAllActivitives;

   public static void main(String[] args) {
      StudentDataBase.getAllStudents().forEach(c1);
      StudentDataBase.getAllStudents().forEach(c2);

   }
}
