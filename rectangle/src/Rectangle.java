import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int a = sc.nextInt();

        System.out.print("Enter The number :- ");
        int b =  sc.nextInt();
        int area = a*b;


        System.out.println("This  Ans is  Rectangle : "+area);
    }
}