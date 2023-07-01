package chapter4;

import java.util.Scanner;

/*
Loop = structure that cause a block of code to repeat
 */
public class While {
    public static void main(String[] args) {
        // what we know
        int hourlypay = 15;
        int maxhours = 40;

        System.out.println("Enter the number of hours that you worked in this week");
        Scanner scanner = new Scanner(System.in);
        double hourworked = scanner.nextDouble();

        while (hourworked>maxhours || hourworked<1){
            System.out.println("Please enter the valid worked hour");
            hourworked = scanner.nextDouble();
        }

        scanner.close();

        double totalpay= hourlypay*hourworked;
        System.out.println("your total pay is $" +totalpay);

    }
}
