package intro_pt2.JavaFX.ParametersTest;

import javafx.application.Application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String title = userInterface();

        Application.launch(JavaFXApp.class,
                "--title=" + title);
    }

    public static String userInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a title: ");
                String title = scanner.nextLine();
                if (!title.isEmpty()) {
                    return title;
                } else {
                    System.out.println("Title cannot be empty.");
                }
            } catch (Exception e) {
                System.out.println("Error processing input. Try again.");
            }
        }
    }
}
