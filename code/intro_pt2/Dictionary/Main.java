package intro_pt2.Dictionary;

import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        SaveableDictionary dictionary = new SaveableDictionary("dictionary.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        System.out.println(dictionary.translate("computer"));
        dictionary.add("computer", "tietokone");
        dictionary.add("hello", "bonjour");

        boolean canSave = dictionary.save();
        System.out.println(canSave);
    }
}
