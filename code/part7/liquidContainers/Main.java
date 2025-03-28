package part7.liquidContainers;

import org.w3c.dom.Text;

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
