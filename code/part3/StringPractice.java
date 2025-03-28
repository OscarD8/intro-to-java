package part3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String[] greatestArray = new String[2];
        String[] currentArray;
        int intYearSum = 0;
        int count = 0;

        System.out.println("Enter a sentence: ");
        // Loop for user input
        while (true) {
            String sentence = reader.nextLine();

            if (sentence.isEmpty()) {
                System.out.println("Exiting");
                break;
            }

//            stringToArray(sentence);
//            wordContains(sentence);
//            getFirstWord(sentence);
//            getLastWord(sentence);

                // Compare Arrays - Int
//            currentArray = stringReturnArray(sentence);
//            if (greatestArray[1] == null) {
//                greatestArray = currentArray;
//            }
//
//            greatestArray = csvHandler(greatestArray, currentArray);

            currentArray = stringReturnArray(sentence);
            if (greatestArray[1] == null) {
                greatestArray = currentArray;
            }

                //Compare Arrays - string length
            greatestArray = compareStringLength(greatestArray, currentArray);
            intYearSum += Integer.valueOf(currentArray[1]);
            count += 1;

        }

            // Printing Greatest age
//        if (greatestAge > 0) {
//            System.out.println("Age of the oldest: " + greatestAge);
//        } else {
//            System.out.println("There seems to be a problem.");
//        }

            // Print Greatest Age and Name
//        System.out.println("Name of the oldest: " + greatestArray[0] + ".\n" +
//                           "Age of the oldest: " + greatestArray[1]);

            // Print the longest name etc.
        printStatistics(greatestArray, intYearSum, count);
    }



    public static void stringToArray(String string) {
        System.out.println();
        String[] sentenceArray = string.split(" ");

        for (String word : sentenceArray) {
            System.out.println(word);
        }
    }

    public static String[] stringReturnArray(String string) {
        return string.split(",");
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

    public static void getFirstWord(String string) {
        System.out.println();
        String[] sentenceArray = string.split(" ");

        System.out.println(sentenceArray[0]);
    }

    public static void getLastWord(String string) {
        System.out.println();
        String[] sentenceArray = string.split(" ");

        for (int i = sentenceArray.length - 1; i > sentenceArray.length - 2; i--){
            System.out.println(sentenceArray[i]);
        }
    }

    public static String[] csvHandler(String[] currentArray, String[] currentGreatestArray) {

        int currentAge = Integer.valueOf(currentArray[1]);
        int currentGreatest = Integer.valueOf(currentGreatestArray[1]);

        if (currentAge > currentGreatest) {
            return currentArray;
        } else {
            return currentGreatestArray;
        }
    }

    public static String[] compareStringLength(String[] currentArray, String[] currentGreatestArray) {

        int currentLength = Integer.valueOf(currentArray[0].length());
        int currentGreatest = Integer.valueOf(currentGreatestArray[0].length());

        if (currentLength > currentGreatest) {
            return currentArray;
        } else {
            return currentGreatestArray;
        }
    }

    public static void printStatistics(String[] array, int sum, int count) {
        System.out.println("Longest name: " + array[0] + "\n" +
                            "Average of the birth years: " + (1.0 * sum / count));
    }
}
