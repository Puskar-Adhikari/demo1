package chapter3;

import java.util.Scanner;

public class RelationalLogical {
    /*
    If a Certain Situation occurs,
    Check for the next situation

     */

/*
Qualify for the loan must have atleast: $30,000
and working at their current job for at least 2 years.
 */

        public static void main(String[] args) {
            int minimalyears= 2;
            int minimalsalary= 30000;

            System.out.println(" what is your salary amount $");
            Scanner scanner = new Scanner(System.in);
            double salary = scanner.nextInt();

            System.out.println(" from how many years you are working in this company");
            int year = scanner.nextInt();

            if(salary>=minimalsalary && year>=minimalyears ){
                    System.out.println("Congratulation! you are eligible for the loan");
                }
                else{
                    System.out.println("You are not eligible for the loan");
                }
            }
        }



