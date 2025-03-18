package week3;
import java.util.HashMap;
import java.util.Map;

public class PunctuationCount {
    public static void main(String[] args) {
        String text = "Hello!!!!! my name is dibas mainali. what are you doing? lets's play a game: ";

        // Define punctuation characters to count
        char[] punctuations = {'.', ',', '-', '!', '?', ';', ':', '\''};

        // Map to store punctuation counts
        Map<Character, Integer> punctuationCounts = new HashMap<>();

        // Initialize map with punctuation keys
        for (char p : punctuations) {
            punctuationCounts.put(p, 0);
        }

        // Count punctuation occurrences
        for (char c : text.toCharArray()) {
            if (punctuationCounts.containsKey(c)) {
                punctuationCounts.put(c, punctuationCounts.get(c) + 1);
            }
        }

        // Print the result
        System.out.println("Punctuation Count:"+ text);
        for (Map.Entry<Character, Integer> entry : punctuationCounts.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}


