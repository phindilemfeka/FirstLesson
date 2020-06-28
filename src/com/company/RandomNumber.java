package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    static void generateRandomNumber() {

        Random rand = new Random();
        int upperbound = 100;
        int random = rand.nextInt(upperbound);
        //System.out.println(random);

        int guessedRandom = 0;
        int counter = 1;
        //System.out.println("You have five chances to guess a random number.");

        while (guessedRandom!=random) {

            if (counter<=100) {

                System.out.println("Enter here to guess: ");
                Scanner scan = new Scanner(System.in);
                guessedRandom= scan.nextInt();

                if (guessedRandom > random) {
                    System.out.println("Number is higher than random");

                } else if (guessedRandom < random) {
                    System.out.println("Number is lower than random");

                } else {
                    System.out.println("Congratulations, you are correct!!");
                        break;
                }
                counter++;

            }else {
                System.out.println("Sorry, you have exceeded the number of guesses");
                break;
            }
        }
    }

    public static void main(String[] args) {
        RandomNumber.generateRandomNumber();
    }
}
