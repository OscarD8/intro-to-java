package intro_pt2.JavaFX.SceneSwitching.Joke;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class AppState
{
    private final Map<JokeKey, Joke> jokes = new HashMap<>();
    private JokeKey currentKey;

    public AppState() {
        jokes.put(JokeKey.JOKE1, new Joke("What do you call a bear with no teeth?", "A gummy bear.", "No teeth = gummy, get it?"));
        jokes.put(JokeKey.JOKE2, new Joke("What's funny about death?", "It will make more cents than my life.", "Play on 'sense' and 'cents'."));
        jokes.put(JokeKey.JOKE3, new Joke("Why don’t skeletons fight each other?", "They don’t have the guts.", "Skeletons lack organs = no courage."));
        jokes.put(JokeKey.JOKE4, new Joke("Why did the scarecrow win an award?", "Because he was outstanding in his field.", "Pun: outstanding means 'great' and 'in a field'."));
        jokes.put(JokeKey.JOKE5, new Joke("What do you call fake spaghetti?", "An impasta.", "Pun: 'impasta' sounds like 'imposter'."));
    }

    public JokeKey  getRandomKey() {
        JokeKey[] values = JokeKey.values();
        currentKey = values[ThreadLocalRandom.current().nextInt(values.length)];
        return currentKey;
    }

    public Joke getCurrentJoke() {
        return jokes.get(currentKey);
    }

    public Joke getJoke(JokeKey key) {
        currentKey = key;
        return jokes.get(key);
    }
}
