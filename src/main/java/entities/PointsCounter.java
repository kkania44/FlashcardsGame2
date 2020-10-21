package entities;

public class PointsCounter {

    private int allAnswers = 0;
    private int correctAnswers = 0;

    public PointsCounter() {
    }

    public void correctAnswer() {
        correctAnswers++;
        allAnswers++;
    }

    public void wrongAnswer() {
        allAnswers++;
    }

    @Override
    public String toString() {
        return correctAnswers + "/" + allAnswers;
    }

}
