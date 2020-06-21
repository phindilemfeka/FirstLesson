package com.company;

public class HeadMaster {
    private static HeadMaster headMaster;

    private HeadMaster(){ //private constructor to prevent instantiation and extension of principal class
    }

    public static void getPrincipal() {

        if(headMaster==null){
            HeadMaster pr = new HeadMaster();
            System.out.println("You have elected headmaster for the school.");

        }else {
            System.out.println("You have already selected a headmaster for the school.");

        }
    }

    public static void main(String[] args) {

        HeadMaster.getPrincipal();

    }


}
