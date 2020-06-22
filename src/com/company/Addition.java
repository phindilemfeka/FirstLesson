package com.company;

import java.util.Scanner;

public class Addition {
    static void addTwoNumbers() {

        int response = 0;
        int sum = 0;

        do {
            System.out.println("Enter first number: ");
            Scanner scan = new Scanner(System.in);
            int firstNumber = scan.nextInt(); //getting first value

            System.out.println("Enter second number: ");
            int secondNumber = scan.nextInt(); //getting second value

            sum = firstNumber + secondNumber;
            System.out.println("The sum is: "+sum);

            System.out.println("Enter 1 to repeat otherwise 2: ");
           response = scan.nextInt();


        } while (response==1);
        if (response==2){
            System.out.println("Bye!!");
        }
    }

    public static void main(String[] args) {
        addTwoNumbers();
    }
}
