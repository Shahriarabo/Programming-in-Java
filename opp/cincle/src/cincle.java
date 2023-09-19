import java.util.Scanner;

class cincle {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        double r = ac.nextDouble();
        double area = (22*r*r)/7;
        System.out.print("Area is :  "+area);

    }
}