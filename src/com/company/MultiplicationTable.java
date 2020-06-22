package com.company;

import java.util.Scanner;

public class MultiplicationTable {

    static void multiplyInput(int input,int limit){


        // responsible for printing multiplication table of given number input up to a certain limit
        for (int i=1; i<=limit; i++){
            System.out.println(input+" "+"*"+" "+i+" "+"="+i*input);
        }
    }

    public static void main(String[] args) {
        multiplyInput(5,10);
    }
}
