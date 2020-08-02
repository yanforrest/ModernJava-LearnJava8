package com.learnJava.data;

public class Bike {

   private String Name;

   private String model;

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   @Override
   public String toString() {
      return "Bike{" +
         "Name='" + Name + '\'' +
         ", model='" + model + '\'' +
         '}';
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }
}
