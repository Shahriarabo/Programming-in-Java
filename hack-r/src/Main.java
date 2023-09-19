import java.util.Scanner;
public class ColumnOutput {
    public static void main(String[] args) {
        System.out.println("================================");
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.next();

        int[] numbers = {100, 65, 50};

        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            int num = numbers[i];

            String paddedNum = String.format("%03d", num);
            System.out.printf("%-10s %s%n", str, paddedNum);

        }
        System.out.println("================================");
    }
}
