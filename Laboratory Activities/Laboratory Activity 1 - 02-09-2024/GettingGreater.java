import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nGetting the Greater Value");

        System.out.print("Enter first character: ");
        char first = scanner.next().charAt(0);

        System.out.print("Enter second character: ");
        char second = scanner.next().charAt(0);

        char greater = (char) Math.max(first, second);

        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + greater);
        System.out.println("-------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(first + " : " + (int) first);
        System.out.println(second + " : " + (int) second);
    }
}
