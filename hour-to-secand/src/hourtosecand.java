import java.util.Scanner;

public class hourtosecand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Hour :- ");
        int hour = sc.nextInt();
        int secand  = hour * 60*60;





        System.out.println("Hour is : "+hour + " Secand is : "+secand);
    }
}