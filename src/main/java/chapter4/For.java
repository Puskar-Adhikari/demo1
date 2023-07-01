package chapter4;

import java.util.Scanner;
/*
for loop is count controll (run a specific number of times, pretest(condition is test), execution(Best to use when the loop may not need to execute ))
 */
public class For {
    /*
    Scan a given number of items and tall the cost
     */

    public static void main(String[] args) {

        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total =0;

        //create loop to iterate all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){

            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();

            total = total + price;

            }
        scanner.close();

        System.out.println("The total price is $" +total);
        }

    }

