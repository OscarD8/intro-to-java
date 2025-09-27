package intro_pt1.part7.liquidContainers;

import java.util.Scanner;

public class UI
{
    private final Scanner scanner;
    private final ContainerCouple containerCouple;

    public UI(Scanner scanner, ContainerCouple containerCouple) {
        this.scanner = scanner;
        this.containerCouple = containerCouple;
    }

    public void start() {
        label:
        while (true) {
            System.out.println(containerCouple);
            System.out.print("Command: ");
            String userInput = scanner.nextLine();
            String[] parts = userInput.split(" ");

            switch (parts[0]) {
                case "quit":
                    break label;
                case "add":
                    containerCouple.setAmount(Integer.parseInt(parts[1]));
                    break;
                case "move":
                    containerCouple.moveAmount(Integer.parseInt(parts[1]));
                    break;
                case "remove":
                    containerCouple.removeAmount(Integer.parseInt(parts[1]));
                    break;
            }
        }
    }
}
