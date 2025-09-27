package intro_pt1.part6.CleanCode;

import java.util.Scanner;

public class TextUI
{
    private final Scanner scanner;
    private final SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("end")) {
                System.out.println("Bye Bye.");
                break;
            }
            else if (userInput.equalsIgnoreCase("add")) {
                add();
            }
            else if (userInput.equalsIgnoreCase("search")) {
                search();
            }
            else {
                System.out.println("Unknown Command.");
            }
        }
    }


    public void add() {
        System.out.print("Word: ");
        String sourceWord = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(sourceWord, translation);
    }
    public void search() {
        System.out.print("Word: ");
        String searchWord = scanner.nextLine();
        System.out.println(dictionary.translate(searchWord));
    }
}
