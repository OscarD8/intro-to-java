package intro_pt2.JavaFX.SceneSwitching.Joke;

public class Joke
{
    private final String question;
    private final String answer;
    private final String explanation;

    public Joke(String question, String answer, String explanation) {
        this.question = question;
        this.answer = answer;
        this.explanation = explanation;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getExplanation() {
        return explanation;
    }
}
