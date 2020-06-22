package com.company;

public class Diamond {
    static void drawDiamond(int maxNumber){


        for (int i=0; i<maxNumber; i++){ //Outer loop (Columns)

            for (int s=i; s>i-1; s--){ //Space loop
                System.out.println("");
            }
            for (int j=0; j<i; j++){ //Main loop for drawing (Rows)
                System.out.print(" *");
            }
            System.out.println();


        }for (int i=maxNumber-1; i>0; i--){ //Outer loop (Columns)

            for (int s=0; s<i; s++){ //Space loop
                System.out.println("");
            }
            for (int j=0; j<i; j++){ //Main loop for drawing (Rows)
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamond.drawDiamond(5);
    }
}

//      o s=n
//    o   o s=n-1
//  o   o   o s=n-2
// o  o   o   o s=n-3
//  o   o    o s=n+2
//    o    o s+1
//       o s=n
