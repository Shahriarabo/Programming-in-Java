import java.util.Scanner;

public class switchs {
    public static void main(String[] args) {

        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        mark = sc.nextInt();

        String grade;
        switch(mark/10){
            case 10:
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "A-";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;

            case 4:
                grade = "D";
                break;
            default:
                grade ="Fail";
                break;

        }
        System.out.println("Grade : "+grade);


    }
}