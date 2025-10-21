package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.println("a. Tunja es la capital de Boyacá ?");
        boolean answer1 = console.nextBoolean();
        if (answer1) {
            System.out.println("Correcto");
            System.out.println("b. El euro es la moneda oficial de España ?");
            boolean answer2 = Boolean.parseBoolean(console.nextLine());
            if (answer2) {
                System.out.println("Correcto");
                System.out.println("c. El período de los alcaldes es de tres años ?  ");
                boolean answer3 = Boolean.parseBoolean(console.nextLine());
                if (answer3) {
                    System.out.println("Incorrecto");
                    System.out.println("Has perdido el juego");
                    
                } else {
                    System.out.println("Correcto");
                    System.out.println("Has ganado el juego");
                }
            } else {
                System.out.println("Incorrecto");
                System.out.println("Has perdido el juego");
            }

        } else {
            System.out.println("Incorrecto");
            System.out.println("Has perdido el juego");
        }
        console.close();
    
    }
}
