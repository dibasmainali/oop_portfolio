package QnA;

public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.add(new Question("What is the capital city of Nepal?", "Kathmandu", "Ktm"));
        quiz.add(new Question("What is the national flower of Nepal?", "Rhododendron", "Laliguras"));
        quiz.add(new Question("Which mountain is the highest peak in Nepal and the world?", "Mount Everest", "Everest", "Sagarmatha"));
        quiz.add(new Question("What is the currency of Nepal?", "Nepalese Rupee", "Rupee", "NPR"));
        quiz.add(new Question("Who is the living goddess worshipped in Nepal?", "Kumari" ));

        quiz.giveQuiz();
    }
}
