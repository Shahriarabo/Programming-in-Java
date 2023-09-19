import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int a = sc.nextInt();

        System.out.print("Enter The number :- ");
        int b =  sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        float div = a/b;

        System.out.println("This  Ans is Add : "+add);
        System.out.println("This  Ans is Sub : "+sub);
        System.out.println("This  Ans is Mul : "+mul);
        System.out.println("This  Ans is Div : "+div);

    }
}
