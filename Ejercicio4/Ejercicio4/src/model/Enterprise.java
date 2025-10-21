package model;

public class Enterprise {
  private Truck truck1;
  private Truck truck2;
  private Truck truck3;

  public void setTruck1(Truck truck1) {
      this.truck1 = truck1;
  }

  public void setTruck2(Truck truck2) {
      this.truck2 = truck2;
  }

  public void setTruck3(Truck truck3) {
      this.truck3 = truck3;
  }

  public int toralCapacity() {
      int totalCapacity = truck1.getCapacity() + truck2.getCapacity() + truck3.getCapacity();
      return totalCapacity;
  }

  public double avgConsumption() {
      double avgConsumption = (truck1.getConsumption() + truck2.getConsumption() + truck3.getConsumption()) / 3;
      return avgConsumption;
  }
}
