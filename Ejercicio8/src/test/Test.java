package test;
import java.util.Scanner;

import model.Factorial;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = Integer.parseInt(console.nextLine());
        console.close();

        Factorial factorial = new Factorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial.calculateFactorial());    
    }
}
