import java.util.Scanner;
public class Reverse {

    static void reverseNumber() {

        System.out.println("Enter integer");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String numberToString = String.valueOf(number);
        char[] stringToCharArray = numberToString.toCharArray();

        for (int i=stringToCharArray.length-1; i>=0; i-- ){
            System.out.print(stringToCharArray[i]);

        }

    }

    public static void main (String[]args){
        reverseNumber();

    }
}

