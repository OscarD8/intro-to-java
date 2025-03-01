package code.part6.JokeManage;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(Scanner scanner, JokeManager jokeManager) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");

        enterCommands();
    }

    public void enterCommands() {
        while (true) {
            System.out.println();
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            switch (input) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokeManager.addJoke(joke);
                    break;
                case "2":
                    jokeManager.drawJoke();
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    this.jokeManager.printJokes();
                    break;
                default:
                    System.out.println("Unknown command..");
            }
        }
    }
}
