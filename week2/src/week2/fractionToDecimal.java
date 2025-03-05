package week2;
import java.util.Scanner;


public class fractionToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scan.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scan.nextInt();
        if (denominator != 0) {
            double decimal = (double) numerator / denominator;
            System.out.println("Decimal equivalent: " + decimal);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

}
