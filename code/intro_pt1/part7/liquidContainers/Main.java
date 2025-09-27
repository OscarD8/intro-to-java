package intro_pt1.part7.liquidContainers;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        ContainerCouple containerCouple = new ContainerCouple();
        Scanner scanner = new Scanner(System.in);
        UI ui = new UI(scanner, containerCouple);

        ui.start();
    }
}
