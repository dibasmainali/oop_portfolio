package QnA;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String questionText;
    private List<String> correctAnswers;

    public Question(String questionText, String... correctAnswers) {
        this.questionText = questionText;
        this.correctAnswers = Arrays.asList(correctAnswers);
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isCorrect(String userAnswer) {
        String answer = userAnswer.trim().toLowerCase();
        for (String correct : correctAnswers) {
            if (correct.toLowerCase().equals(answer)) {
                return true;
            }
        }
        return false;
    }
}
