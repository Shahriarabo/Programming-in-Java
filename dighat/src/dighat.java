import java.util.Scanner;

public class dighat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        double a = sc.nextDouble();

        System.out.print("Enter The number :- ");
        double b =  sc.nextDouble();


        System.out.print("Enter The number :- ");
        double c =  sc.nextDouble();


        double d = b*b-4*a*c;

        if(d>0){
            double r1 = ((-b+Math.sqrt(d))/2*a);
            double r2 = ((-b-Math.sqrt(d))/2*a);
            System.out.println("The root are : "+r1+" And "+r2);
        } else if (d==0) {

            double r = (-b/(2*a));
            System.out.println("The root are : "+r);
        }else {
            System.out.println("Root are not possible");
        }
        
    }
}