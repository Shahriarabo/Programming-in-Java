import java.util.Scanner;

public class PrintASCIIValue {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.println("Enter a character: ");

        // Read the user's input
        char ch = scanner.next().charAt(0);

        // Get the ASCII value of the character
        int asciiValue = (int) ch;

        // Print the ASCII value of the character
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
    }
}