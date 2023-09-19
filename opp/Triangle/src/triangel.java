import java.util.Scanner;

class triangel {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        System.out.print("Enter the Base Triangel : ");
        double Base = ac.nextDouble();
        System.out.print("Enter the Height Triangel : ");
        double Height = ac.nextDouble();

        double area = 0.5*Height*Base;
        System.out.print("Area of Triangel is :  "+area);

    }
}