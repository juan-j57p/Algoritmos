package test;
import java.util.Scanner;   
import model.Database;

public class Test {
    private Scanner console;
    private Database database;

    public Test() {
        this.console = new Scanner(System.in);
        this.database = new Database();
    }

    public void run() {
        System.out.print("Enter a number to search (1-20): ");
        int number = console.nextInt();
        int position = database.search(number);
        if (position != -1) {
            System.out.println("Number " + number + " found at position: " + position);
        } else {
            System.out.println("Number " + number + " not found in the database.");
        }
    }
    public static void main(String[] args) throws Exception {
        Test test = new Test();
        test.run();
    }
}
