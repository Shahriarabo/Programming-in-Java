import java.util.Scanner;

public class hourtominute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Hour :- ");
        int hour = sc.nextInt();

        int minute = hour * 60;




        System.out.println("Hour is : " +hour + " Minute is : "+minute);
    }
}