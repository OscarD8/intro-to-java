package intro_pt2.HashMap;

import java.util.HashMap;

public class Book {
    private String name;
    private String releaseYear;

    public Book(String name, String releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.releaseYear + ")";
    }


    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println("Name: " + book);
        }
    }

    public static String sanitiseString(String string) {
        return string.toLowerCase().trim();
    }

    public static void printValuesIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().toLowerCase().contains(sanitiseString(text))) {
                System.out.println("Name: " + book);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();
        directory.put("sense", new Book("Sense and Sensibility", "1880"));
        directory.put("pride", new Book("Pride and Prejudice", "1803"));

        printValues(directory);
        System.out.println("---");
        printValuesIfNameContains(directory,  "pride");

    }
}
