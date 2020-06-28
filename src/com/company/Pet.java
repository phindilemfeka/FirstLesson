package com.company;

import java.util.Scanner;

class Pet {

    private String petName;
    private String sound;
    private String furColour;
    private String faceShape;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String name) {
        this.petName = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFurColour() {
        return furColour;
    }

    public void setFurColour(String fur) {
        this.furColour = fur;
    }

    public String getFaceShape() {
        return faceShape;
    }

    public void setFaceShape(String faceShape) {
        this.faceShape = faceShape;
    }

    public static void main(String[] args) {

        int answer = 0;
do {

    System.out.println("Welcome, enter 1 for cat properties and 2 for dog properties:");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    Pet pet;

    if (choice==1) {
        pet = new Cat();

        System.out.println("Cat properties:");
        System.out.println();

        pet.setPetName("Name: " + "Catty");
        System.out.println(pet.getPetName());

        pet.setSound("Sound: " + "Meows");
        System.out.println(pet.getSound());

        pet.setFurColour("Fur colour: " + "Grey");
        System.out.println(pet.getFurColour());

        pet.setFaceShape("Face shape: " + "Round");
        System.out.println(pet.getFaceShape());
        Cat.drink();

    }else {
        pet = new Dog();

        System.out.println("Dog properties:");
        System.out.println();

        pet.setPetName("Pet name: " + "Doggy");
        System.out.println(pet.getPetName());

        pet.setSound("Sound: " + "Barks");
        System.out.println(pet.getSound());

        pet.setFurColour("Fur colour: " + "Brown");
        System.out.println(pet.getFurColour());

        pet.setFaceShape("Face shape: " + "Dish");
        System.out.println(pet.getFaceShape());
        Dog.activity();

    }

    System.out.println("******************************");
    System.out.println();
    System.out.println("Enter 3 to repeat or 4 to exit");
    answer = scan.nextInt();
    if (answer==4){
        System.out.println("Thank you, Bye.");
    }

    }while (answer==3);

    }
}
