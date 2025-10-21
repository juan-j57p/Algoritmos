package test;

import model.MyDate;

public class Test {
    public static void main(String[] args) throws Exception {
        MyDate date = new MyDate(16, 10, 2025);
        System.out.println("Style 1; " + date.formatDate(1));
        System.out.println("Style 2; " + date.formatDate(2));
        System.out.println("Style 3; " + date.formatDate(3));
    }
}
