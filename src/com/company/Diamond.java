package com.company;

public class Diamond {
    static void drawDiamond(int maxNumber){


        for (int i=0; i<=maxNumber; i++){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i=maxNumber; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }

    public static void main(String[] args) {
        Diamond.drawDiamond(4);
    }
}
