package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {
   private static int noOfNoteBooks(){
      int noOfNoteBooks = StudentDataBase.getAllStudents().stream()
         .filter(student -> student.getGradeLevel() >=3.9)
         .filter(student -> student.getGender() == "female")
         .map(Student::getNoteBooks)
         //.reduce(0,(a,b)->a+b);
         .reduce(0, Integer::sum);

      return noOfNoteBooks;

   }
   public static void main(String[] args) {
      System.out.println("noOfNoteBooks: " + noOfNoteBooks());
   }
}
