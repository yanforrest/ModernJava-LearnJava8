package com.learnJava.Optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOrElseExample {
   //orElse
   public static String optionalOrElse(){
      //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
      Optional<Student> optionalStudent = Optional.ofNullable(null);  //Optional.empty


      String name = optionalStudent.map(Student::getName).orElse("Default");
      return name;
   }
   //orElseGet
   public static String optionalOrElseGet() {
      Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

      String name = optionalStudent.map(Student::getName).orElseGet(() -> "Default");
      return name;
   }
   //orElseThrow
   public static String optionalOrElseThrow() {
      //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
      Optional<Student> optionalStudent = Optional.ofNullable(null);

      String name = optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException(" No Data Available ") );
      return name;
   }

   public static void main(String[] args) {
      System.out.println("orElse : " + optionalOrElse());
      System.out.println("orElseGet : " + optionalOrElseGet());
      System.out.println("orElseThrow : " + optionalOrElseThrow());
   }
}
