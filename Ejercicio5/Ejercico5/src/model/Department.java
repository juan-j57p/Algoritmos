package model;

public class Department {
    private int sells;
    private int salary = 2000;

    public Department(int sells) {
        this.sells = sells;
    }

    public int getSells() {
        return sells;
    }
    
    public int getSalary() {
        return salary;
    }
}
