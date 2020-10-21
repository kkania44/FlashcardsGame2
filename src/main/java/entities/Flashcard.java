package entities;

public class Flashcard {

    private String definition;
    private String answer;

    public Flashcard(String definition, String answer) {
        this.definition = definition;
        this.answer = answer;
    }

    public boolean checkAnswer(String userAnswer) {
        return this.answer.equals(userAnswer.toUpperCase());
    }

    public String getDefinition() {
        return definition;
    }

    public String getAnswer() {
        return answer;
    }

}
