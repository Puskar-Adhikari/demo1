package chapter3;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Enter your grade letter");
        Scanner scanner = new Scanner(System.in);
        String grade    = scanner.next();
        String message;

        switch (grade){
            case "A":
               message= "Excellent job!";
               break;

            case "B":
                message="Great Job!";
                break;

            case "C":
                message="Good Job!";
                break;

            case "D":
                message="need to work hard !";
                break;

            case "F":
                message="uh oh!";
                break;

            default:
                message="Error. Invalid grade";
                break;
        }
        System.out.println(message);


    }
}
