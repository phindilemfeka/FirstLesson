package com.company;

import java.util.Scanner;

class Pet {
    private String name;
    private String sound;
    private String fur;
    private String faceShape;

    void makeSound(String name,String sound,String fur,String faceShape){
        System.out.println("The properties of my "+name+":"+"\n"+fur+" fur"+"\n"+sound+"\n"+faceShape+" faceshape");

    }

    public static void main(String[] args) {

        int answer = 0;
do {

    System.out.println("Welcome, enter 1 for cat sound and 2 for dog sound:");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    Pet pet;

    if (choice==1) {
        pet = new Cat();
        pet.makeSound(" Cat", "meows","grey","round");
    }

    else {
        pet = new Dog();
        pet.makeSound(" Dog", "barks","brown","dish");
    }

    System.out.println("Enter 3 to repeat or 4 to exit");
    answer = scan.nextInt();
    if (answer==4){
        System.out.println("Bye.");
    }

}while (answer==3);
    }
}
