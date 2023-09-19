import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int  mark= sc.nextInt();



        if (mark>40){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}