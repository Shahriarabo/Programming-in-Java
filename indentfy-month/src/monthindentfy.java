import java.util.Scanner;

public class monthindentfy {
    public static void main(String[] args) {

        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        monthN = sc.nextInt();

        String grade;
        switch(monthN){
            case 12:
            case 1:
                monthN = "January";
                break;
            case 2:
                monthN = "Fubruary";
                break;
            case 3:
                monthN = "March";
                break;
            case 4:
                monthN = "April";
                break;
            case 5:
                month = "May";
                break;

            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "Augest";
                break;
            case 9:
                month = "Sectember";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "Desember";
                break;
            default:
                month ="Invelt";
                break;

        }
        System.out.println("Grade : "+month);


    }
}