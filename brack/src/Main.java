import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int n=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n =sc.nextInt();
        for (;;){
            if(n<=0){
                continue;
            }else {
                break;
            }
        }

        System.out.println("You have : "+n);
    }
}