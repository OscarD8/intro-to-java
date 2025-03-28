package part6.CleanCode;

import java.util.ArrayList;

public class WordList
{
    protected final ArrayList<String> words;

    public WordList() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        if (contains(word)) {
            return;
        }
        this.words.add(word);
    }

    public void removeString(String word) {
        this.words.remove(word);
    }
    public void removeIndex(int index) {
        this.words.remove(index - 1);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }

    public ArrayList<String> getList() {
        return this.words;
    }

    public String getWord(int index) {
        return words.get(index);
    }
    public int getIndex(String word) {
        return words.indexOf(word);
    }
}
