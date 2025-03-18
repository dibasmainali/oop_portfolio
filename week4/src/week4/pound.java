package week4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class pound {
    public static void main (String[] args) {
        final double OUNCES_PER_POUND = 16.0;

        double pricePerPound;    
        double weightOunces;  
        double weight;              
        double totalPrice;        

        Scanner scan = new Scanner(System.in);

        NumberFormat money = NumberFormat.getCurrencyInstance(); // Part 3
        DecimalFormat fmt = new DecimalFormat("0.00"); // Part 4

        System.out.println("Welcome to the CS Deli!!\n ");

        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        System.out.println("\n*****  CS Deli  *****");
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("TOTAL: " + money.format(totalPrice));

        scan.close();
    }
}

