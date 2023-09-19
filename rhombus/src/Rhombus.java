import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        double a = sc.nextInt();

        System.out.print("Enter The number :- ");
        double b =  sc.nextInt();
        double area = (a*b)*0.5;


        System.out.println("This  Ans is : "+area);
    }
}