import java.util.Scanner;

public class MinutetoHour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Minute :- ");
        int minute = sc.nextInt();

        int hour = minute / 60;
        int minutehour = minute-(hour*60) ;



        System.out.println(minute + " Minute = " + hour + " Hour and " + minutehour+ " Minute");
    }
}