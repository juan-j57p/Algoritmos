package test;

import java.util.ArrayList;

import model.Company;
import model.Department;

public class Test {
    public static void main(String[] args) throws Exception {
      Department department1 = new Department(1000);
      Department department2 = new Department(2000);
      Department department3 = new Department(3000);

      Company company = new Company(department1, department2, department3); 
      ArrayList<Integer> totalSalary = company.totalSalary();
      
      for (int i = 0; i < totalSalary.size(); i++) {
        System.out.println("Total salary department " + (i+1) + ": " + totalSalary.get(i));
      }
    }
}
