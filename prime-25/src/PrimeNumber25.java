import java.util.Scanner;

public class PrimeNumber25 {

    public static void main(String[] args) {
        int i,j;


        boolean isPrime = true;

        for( int  i= 2; i<=25;i++ ){
            for ( j = 2; j <= (i/j); j++) {
                if (j % i == 0) {
                    break;
                }
            }
        }

        if (j>(i/j)) {
            System.out.println(i);
        }
    }
}
