package week4;
import java.util.Random;
import java.util.Scanner;

class Die {
    private int sides;
    private Random rand;

    public Die(int sides) {
        this.sides = sides;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(sides) + 1; // Generates a random number between 1 and sides (inclusive)
    }
}

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sides does die 1 have? ");
        int sides1 = scanner.nextInt();
        Die die1 = new Die(sides1);

        System.out.print("How many sides does die 2 have? ");
        int sides2 = scanner.nextInt();
        Die die2 = new Die(sides2);

        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= 3; i++) {
            int roll1 = die1.roll();
            int roll2 = die2.roll();

            System.out.println("Die 1 roll " + i + " = " + roll1 + ".");
            System.out.println("Die 2 roll " + i + " = " + roll2 + ".");

            sum1 += roll1;
            sum2 += roll2;
        }

        double avg1 = sum1 / 3.0;
        double avg2 = sum2 / 3.0;

        System.out.printf("Die 1 rolled a total of %d and rolled %.3f on average.%n", sum1, avg1);
        System.out.printf("Die 2 rolled a total of %d and rolled %.3f on average.%n", sum2, avg2);

        scanner.close();
    }
}
