package QnA;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private final int MAX_QUESTIONS = 25;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void add(Question q) {
        if (questions.size() < MAX_QUESTIONS) {
            questions.add(q);
        } else {
            System.out.println("Quiz is full. Cannot add more than 25 questions.");
        }
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.getQuestionText());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (q.isCorrect(userAnswer)) {
                score++;
            } else {
            }
        }

        System.out.println(" Quiz Completed!");
        System.out.println("Your final score: " + score + " out of " + questions.size());
    }
}
