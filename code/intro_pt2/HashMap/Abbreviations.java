package intro_pt2.HashMap;

import java.util.HashMap;


public class Abbreviations
{
    private final HashMap<String,String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }


    public void addAbbreviation(String key, String explanation)
    {
        this.abbreviations.put(key, explanation);
    }

    public boolean hasAbbreviation(String abbreviation)
    {
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }



    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(sanitiseString(text))) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static String sanitiseString(String string) {
        return string.toLowerCase().trim();
    }


    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part :  text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println();

        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("e.g.", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e.", "more precisely");
        System.out.println();

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, "e.");

    }
}
