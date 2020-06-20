package com.company;

import java.util.Scanner;

public class Addition {
    static void addTwoNumbers() {

        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt(); //getting first value

        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt(); //getting second value
        int sum;
        String response;

        do {

            sum = firstNumber + secondNumber;

            System.out.print("The sum is: ");
            System.out.println(sum);

        } while (false);

        System.out.println("To repeat enter y: ");
        response = scan.nextLine().toLowerCase();
        if (response.equals("y")){
            addTwoNumbers();
        }else {
            System.out.println("invalid");
        }

    }

    public static void main(String[] args) {
        addTwoNumbers();
    }
}
