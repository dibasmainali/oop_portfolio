package question5;

import java.util.Random;

public class CardDealer {
    private static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            String suit = suits[rand.nextInt(suits.length)];
            String faceValue = faceValues[rand.nextInt(faceValues.length)];
            System.out.println(new card(suit, faceValue));
        }
    }
}

