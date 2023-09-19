import java.util.Scanner;

public class forn {
    public static void main(String[] args) {

        int j, n ,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :- ");
        n = sc.nextInt();

        for(i=1;i>=n;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }




    }
}