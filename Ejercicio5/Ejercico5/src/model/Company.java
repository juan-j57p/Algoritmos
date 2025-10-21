package model;

import java.util.ArrayList;

public class Company {
   private Department department1;
   private Department department2;
   private Department department3;

   public Company(Department department1, Department department2, Department department3) {
       this.department1 = department1;
       this.department2 = department2;
       this.department3 = department3;
   }

   public int totalSells() {
       int total =  department1.getSells() + department2.getSells() + department3.getSells();
       return total;
   }

   public  ArrayList<Double> bonus() {  
      ArrayList<Double> porcentages = new ArrayList<>();
      porcentages.add((department1.getSells() * 100.00) / totalSells());
      porcentages.add((department2.getSells() * 100.00) / totalSells()); 
      porcentages.add((department3.getSells() * 100.00) / totalSells()); 
      
      ArrayList<Double> bonusList = new ArrayList<>();
      if (porcentages.get(0) > 33) {
        bonusList.add(department1.getSalary() * 0.2); 
      }else{ 
        bonusList.add(0.0);
      }
      if (porcentages.get(1) > 33) {
        bonusList.add(department2.getSalary() * 0.2); 
      }else{ 
        bonusList.add(0.0);
      }
      if (porcentages.get(2) > 33) {
        bonusList.add(department3.getSalary() * 0.2); 
      }else{ 
        bonusList.add(0.0);
      }

     return bonusList;
  }

   public ArrayList<Integer> totalSalary() {
    ArrayList<Integer> totalSalary = new ArrayList<>();
    totalSalary.add(department1.getSalary() + bonus().get(0).intValue());
    totalSalary.add(department2.getSalary() + bonus().get(1).intValue());
    totalSalary.add(department3.getSalary() + bonus().get(2).intValue());
    return totalSalary;
   }
     
}
