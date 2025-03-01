package code.part6.ListsAndObjects;

import java.util.ArrayList;

public class SimpleCollection
{
    private final ArrayList<String> collection;

    public SimpleCollection(){
        this.collection = new ArrayList<>();
    }

    public void addItem(String string) {
        this.collection.add(string);
    }

    public String longest() {
        if (this.collection.isEmpty()) {
            return "";
        }
        String longest = collection.getFirst();
        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i).length() > longest.length()) {
                longest = collection.get(i);
            }
        }
        return longest;
    }

    public String toString() {
        String collectionItems = "";
        if (collection.isEmpty()) {
            return "No items in collection.";
        }
        for (String item : collection) {
            collectionItems = collectionItems + item + "\n";
        }
        return collectionItems;
    }
}
