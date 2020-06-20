public class Factorial {

    static int printFactorial(int number){

        if (number==0 || number==1){
            return 1;
        }
        else {
            return number * printFactorial(number -1); //Recursion, calling method printFactorial within itself

        }
    }

    public static void main(String[] args) {

        System.out.println(printFactorial(5));
    }
}
