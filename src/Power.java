public class Power {

    static int raisingToThePower(int base, int power){

        if (base==0)
            return 0;

        else if (power==0)
            return 1;

        else return base*raisingToThePower(base,power-1);
    }

    public static void main(String[] args) {

        System.out.println( raisingToThePower(2,5));
    }
}
