package intro_pt2.HashMap.DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations
{
    HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        dictionary = new HashMap<>();
    }


    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        this.dictionary.get(word).add(translation);
    }


    public ArrayList<String> translate (String word) {
        return this.dictionary.getOrDefault(word,new ArrayList<>());
    }


    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
