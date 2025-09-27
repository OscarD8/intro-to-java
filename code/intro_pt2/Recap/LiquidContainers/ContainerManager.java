package intro_pt2.Recap.LiquidContainers;

import java.util.Scanner;

public class ContainerManager
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ContainerManager containerManager = new ContainerManager();

        while (true) {
            System.out.println(containerManager);
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "break":
                    break;
                case "add":
                    containerManager.addAmount(amount);
                    break;
                case "move":
                    containerManager.moveAmount(amount);
                    break;
                case "remove":
                    containerManager.removeAmount(amount);
                    break;
            }
        }
    }


    private Container first;
    private Container second;


    public ContainerManager()
    {
        first = new Container();
        second = new Container();
    }

    public void addAmount(int amount) {
        first.addAmount(amount);
    }

    public void moveAmount(int amount) {
        if (amount >= first.getFill()) {
            amount = first.getFill();
            first.setFill(0);
        }

        if (second.getFill() + amount > second.getCapacity()) {
            second.setFill(second.getCapacity());
        }
        else {
            second.setFill(second.getFill() + amount);
            first.removeAmount(amount);
        }
    }

    public void removeAmount(int amount) {
        second.removeAmount(amount);
    }

    @Override
    public String toString() {
        return "ContainerManager{" + "first=" + first + ", second=" + second + '}';
    }
}
