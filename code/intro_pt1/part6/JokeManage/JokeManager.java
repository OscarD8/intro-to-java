package intro_pt1.part6.JokeManage;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager
{
    private final ArrayList<String> jokesList;
    private final Random random = new Random();

    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokesList.add(joke);
    }

    public void drawJoke() {
        if (this.jokesList.isEmpty()) {
            System.out.println("You're are a joke.");
            return;
        }
        int index = random.nextInt(jokesList.size());
        System.out.println(this.jokesList.get(index));
    }

    public ArrayList<String> getJokesList() {
        return this.jokesList;
    }

    public void printJokes() {
        for (String joke : this.jokesList) {
            System.out.println(joke);
        }
    }
}
