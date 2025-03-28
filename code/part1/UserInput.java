package part1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will write a story but I need some input.");
        System.out.println("What is the main characters name?");
        String name = scanner.nextLine();
        System.out.println("What is their occupation?");
        String occupation = scanner.nextLine();

        System.out.println("One day, " + name + " had had enough.");
        System.out.println("Tired of doing " + occupation +
                ", they decided to run to the hills and never look back.");
    }
}
