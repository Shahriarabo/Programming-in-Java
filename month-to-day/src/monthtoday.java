import java.util.Scanner;

public class monthtoday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int month = sc.nextInt();
        int day  = month * 30;





        System.out.println("Month is : "+month + "Day is : "+day);
    }
}