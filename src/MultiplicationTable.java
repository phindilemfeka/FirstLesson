import java.util.Scanner;

public class MultiplicationTable {

    static void multiplyInput(){

        int input , limit;

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter an integer of your choice:");

        input = reader.nextInt();

        System.out.println("Enter limit of your multiplication  table");

        limit =reader.nextInt();

//        for (int i=1; i<limit; i++){ // prints the first 15 multiplies of 3
//            System.out.println(i*input);
//
//        }

        for (int i=1; i<limit; i++){ //prints multiplies of 3 ranging from 1-15.
            if (i*input<=limit){
                System.out.println(i*input);
            }
        }

    }

    public static void main(String[] args) {
        multiplyInput();
    }
}
