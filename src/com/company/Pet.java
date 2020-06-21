package com.company;

import java.util.Scanner;

class Pet {
    void makeSound(String name,String sound){
        System.out.println("The "+name+sound);
    }

    public static void main(String[] args) {

        System.out.println("Welcome, enter 1 for cat sound and 2 for dog sound:");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
            Pet cat = new Cat();
            cat.makeSound("Cat", " " + "Meows.");
            break;

            case 2:
            Pet dog = new Dog();
            dog.makeSound("Dog", " " + "Barks.");
        }
    }
}
