import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        // Read and process each input line
        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();

            // Format the output
            System.out.printf("%-15s%03d\n", str, num);
        }

        System.out.println("================================");
        scanner.close();
    }
}
