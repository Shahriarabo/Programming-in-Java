import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int res ,div,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n =sc.nextInt();
        System.out.println("The Ans is : ");


        do{
            res = n%10;
            System.out.print(""+res);
            div = n/10;
            n = div;
        }while (n!=0);
        sc.close();
    }
}