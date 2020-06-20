package com.company;

import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    static void generateRandomNumber() {

        Random rand = new Random();
        int upperbound = 100;
        int random = rand.nextInt(upperbound);
        //System.out.println(random);

        int guessedRandom = 0;

        while (guessedRandom<100) {

            System.out.println("Guess the random number:");
            Scanner scan = new Scanner(System.in);
            guessedRandom= scan.nextInt();

            if (guessedRandom > random) {
                System.out.println("Number is higher than random");
            } else if (guessedRandom < random) {
                System.out.println("Number is lower than random");
            } else {
                System.out.println("correct");
                break;
            }
        }
    }


    public static void main(String[] args) {
        RandomNumber.generateRandomNumber();

    }
}
