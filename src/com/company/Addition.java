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
            System.out.println("The sum is: "+sum);

            System.out.println("Enter Y to repeat otherwise N: ");
            response = scan.nextLine().toLowerCase();

        } while(response.contains("y")); //In a case of "yes" as a response
    }

    public static void main(String[] args) {
        addTwoNumbers();
    }
}
