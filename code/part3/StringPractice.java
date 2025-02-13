package code.part3;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Loop for user input
        while (true) {
            System.out.println();
            System.out.println("Enter a sentence: ");
            String sentence = reader.nextLine();

            if (sentence.isEmpty()) {
                System.out.println("Exiting");
                break;
            }

            stringToArray(sentence);
            wordContains(sentence);
        }
    }

    public static void stringToArray(String string) {
        System.out.println();
        String[] sentenceArray = string.split(" ");

        for (String word : sentenceArray) {
            System.out.println(word);
        }
    }

    public static void wordContains(String string) {
        System.out.println();
        String[] sentenceArray = string.split(" ");

        for (String word : sentenceArray){
            if (word.contains("av")){
                System.out.println(word);
            }
        }
    }
}
