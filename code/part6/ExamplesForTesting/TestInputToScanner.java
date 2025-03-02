package code.part6.ExamplesForTesting;

import java.util.Scanner;
import java.util.ArrayList;

public class TestInputToScanner
{
    public static void main(String[] args) {
        String input = "one\n" + "two\n"  +
                "three\n" + "four\n" +
                "five\n" + "one\n"  +
                "six\n";

        Scanner reader = new Scanner(input);

        ArrayList<String> read = new ArrayList<>();

        while (true) {
            System.out.println("Enter an input: ");
            String line = reader.nextLine();
            if (read.contains(line)) {
                break;
            }

            read.add(line);
        }

        System.out.println("Thank you!");

        for (String word : read) {
            System.out.println(word);
        }

        if (read.contains("six")) {
            System.out.println("A value that should not have been added to the group was added to it.");
        }
    }
}
