import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i=0 ,sum=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n =sc.nextInt();
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println("The Ans is : "+sum);
        sc.close();
    }
}