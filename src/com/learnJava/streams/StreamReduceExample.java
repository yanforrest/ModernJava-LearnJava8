package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

   public static  int performMultiplication(List<Integer>integerList){
       return integerList.stream()
          //.peek(x->System.out.println(x))
          .reduce(1,(a,b) ->{
             System.out.println("a:= " + a + " b:= " + b);
             return a*b;
          });
   }

   public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer>integerList){
      return integerList.stream()
         //.peek(x->System.out.println(x))
         .reduce((a,b) ->{
            System.out.println("a:= " + a + " b:= " + b);
            return a*b;
         });
   }

   public static Optional<Student> getHighestGpaStudent()
   {
//      return StudentDataBase.getAllStudents().stream().reduce((student, student2) -> {
//         if (student.getGpa() > student2.getGpa()){
//            return student;
//         }else{
//            return student2;
//         }
//      });
      return StudentDataBase.getAllStudents().stream().reduce((student, student2) -> (student.getGpa() > student2.getGpa())? student : student2);

   }

   public static void main(String[] args) {
      List<Integer> integerList = Arrays.asList(1,3,5,7,9,11);
      List<Integer> integerListNull = Arrays.asList();

      System.out.println("Perform Multiplication: " + performMultiplication(integerList));
      Optional<Integer> result = performMultiplicationWithoutIdentity(integerListNull);
      System.out.println("performMultiplicationWithoutIdentity: " + result);;
      System.out.println(result.isPresent());
      if(result.isPresent()) {
         System.out.println(result.get());
      }

      Optional<Student> resultStudent = getHighestGpaStudent();
      System.out.println("getHighestGpaWithoutIdentity: " + resultStudent);;

   }
}
