import java.util.Scanner;

public class sqrtfor {
    public static void main(String[] args) {

        int sum , n ,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        n = sc.nextInt();

         sum = 0;
         for(i=1;i<=n;i=i+1){
             sum = sum+(i*i);
         }
        System.out.println("This Ans is : " +sum);



    }
}