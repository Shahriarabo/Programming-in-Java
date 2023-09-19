import java.util.Scanner;

public class tringle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int a = sc.nextInt();

        System.out.print("Enter The number :- ");
        int b =  sc.nextInt();

        System.out.print("Enter The number :- ");
        int c =  sc.nextInt();

        int s = (a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println ("Range is : "+ s);

        System.out.println("This  Ans is : "+ area);
    }
}