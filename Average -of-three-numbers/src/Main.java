import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        double num1 = sc.nextInt();

        System.out.print("Enter The number :- ");
        double num2 =  sc.nextInt();

        System.out.print("Enter The number :- ");
        double num3 =  sc.nextInt();

        double Average = (num1+num2+num3)/3;

        double Add = num1+num2+num3;
        System.out.println("This  Ans is Addition of three numbers  : "+Add);
        System.out.println("This  Ans is Average of three numbers  : "+Average);
    }
}