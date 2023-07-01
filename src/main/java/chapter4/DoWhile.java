package chapter4;

import java.util.Scanner;

public class DoWhile {
    /*
    allow user to enter two numbers and then sum of the two numbers
    repeat this action until they indicate they are done
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again;
        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;

            System.out.println("The sum is $" + sum);

            System.out.println("would you like to start over?");
            again = scanner.nextBoolean();
        }
        while (again);
        scanner.close();
    }

}



