package test;

import java.util.Scanner;

import model.Enterprise;
import model.Truck;


public class Test {
    public void run() {
      Scanner console = new Scanner(System.in);
      String licensePlate = console.nextLine();
      int capacity = Integer.parseInt(console.nextLine());
      double consumption = Double.parseDouble(console.nextLine());
      console.close();
      Enterprise enterprise = createObjects(licensePlate, capacity, consumption);

      System.out.println("Total Capacity: " + enterprise.toralCapacity() + " kg"); ;
      System.out.println("Average Consumption: " + enterprise.avgConsumption() + " galones/km");
    }

    public Enterprise createObjects(String licensePlate, int capacity, double consumption) {
      Truck truck1 = new Truck(licensePlate, capacity, consumption);
      Truck truck2 = new Truck("XYZ-5678", 1500, 12.5);
      Truck truck3 = new Truck("LMN-9101", 2000, 15.0);

      Enterprise enterprise = new Enterprise();
        enterprise.setTruck1(truck1);
        enterprise.setTruck2(truck2);
        enterprise.setTruck3(truck3);
      return enterprise;
    }
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.run();
    }
}
