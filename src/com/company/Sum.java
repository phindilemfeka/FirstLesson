package com.company;

import java.util.Scanner;

public class Sum {
    static void sumTwoNumbers(){

        System.out.println("Enter 1st number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter 2nd number");
        int y= scan.nextInt();
        scan.close();
        int counter =0;

        do {
            int sum = x+y;
            System.out.println(sum);

        }
        while ();

    }

    public static void main(String[] args) {
        sumTwoNumbers();
    }
}
