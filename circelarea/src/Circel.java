import java.util.Scanner;

public class Circel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int r = sc.nextInt();
        double pi = 3.1416;
        double area = pi*r*r;

        System.out.println("This Cdircel Area is : "+ area);
    }
}