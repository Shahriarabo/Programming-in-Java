import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int a = sc.nextInt();


        if (a>0){
            System.out.println(" positive");
        }
        else if(a==0){
            System.out.println("You enter the 0");
        }
        else {
            System.out.println("negative");
        }

    }
}