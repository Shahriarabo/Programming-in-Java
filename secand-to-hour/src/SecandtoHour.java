import java.util.Scanner;

public class SecandtoHour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Secand :- ");
        int secand = sc.nextInt();

        int hour = secand / 3600;
        int secandhour = secand-(hour*3600) ;



        System.out.println(secand + " Secand = " + hour + " Hour and " + secandhour+ " Secand");
    }
}