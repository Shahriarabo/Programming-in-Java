import java.util.Scanner;

public class fors {
    public static void main(String[] args) {

        int m ,i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        m = sc.nextInt();

        for(i=0;i<=m;i++){
            sum =sum+i;
            System.out.println("Number : "+i+"\t\t"+sum);
        }
       // System.out.println("Number : "+i+"\t\t"+sum);



    }
}