package intro_pt2.FlightControl.ui;

import intro_pt2.FlightControl.logic.FlightControl;

import java.util.Scanner;


public class TextUI
{
    private Scanner scanner;
    private FlightControl flightControl;

    public TextUI(Scanner scanner, FlightControl flightControl) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }


    public void start() {
        airportAssetControl();
    }

    private void airportAssetControl() {
        while (true) {
            System.out.println();
            System.out.println("Choose an action: ");
            System.out.println("""
                    [1] Add an airplane
                    [2] Add a flight
                    [x] Exit Airport Asset Control
                    """);
            System.out.print("> ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "x" -> {
                    System.out.println("Exiting Asset Control.");
                    return;
                }
                case "1" -> addAirplane(scanner, flightControl);
                case "2" -> addFlight(scanner, flightControl);
                default -> System.out.println("Unknown command");
            }
        }
    }

    private void addAirplane(Scanner scanner,  FlightControl flightControl) {
        System.out.print("Give the airplane ID: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        flightControl.addAirplane(airplaneID, capacity);
    }

    private void addFlight(Scanner scanner,  FlightControl flightControl) {
        System.out.print("Give the airplane ID: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String origin = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destination = scanner.nextLine();
        flightControl.addFlight(flightControl.getAirplane(airplaneID), origin, destination);
    }
}
