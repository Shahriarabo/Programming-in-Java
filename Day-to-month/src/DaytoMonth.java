import java.util.Scanner;

public class DaytoMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Day :- ");
        int day = sc.nextInt();

        int months = day / 30;
        int daysInMonth = day-(months*30) ;



        System.out.println(day + " Day = " + months + " Month and " + daysInMonth + " Day");
    }
}