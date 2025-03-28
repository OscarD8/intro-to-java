package part6.CleanCode;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI test = new TextUI(scanner, dictionary);
        test.start();

    }
}
