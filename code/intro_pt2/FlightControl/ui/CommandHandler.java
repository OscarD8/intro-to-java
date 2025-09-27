package intro_pt2.FlightControl.ui;

import intro_pt2.FlightControl.logic.FlightControl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandHandler
{
    private final Map<String, Runnable> commandMap = new HashMap<>();
    private final Scanner scanner;
    private final FlightControl flightControl;

    public CommandHandler(Scanner scanner, FlightControl flightControl) {
        this.scanner = scanner;
        this.flightControl = flightControl;
    }


    public void start() {
        assetControl();
        flightControl();
    }

    private void assetControl() {
        initAssetControlCommands();
        System.out.println();
        System.out.println("Airport Asset Control");
        while (true) {
            System.out.println("""
                       
                       Choose an action:
                       [1] Add an airplane
                       [2] Add a flight
                       [x] Exit Airport Asset Control""");
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equals("x")) return;
            handle(input);
        }
    }

    private void flightControl() {
        initFlightControlCommands();
        System.out.println();
        System.out.println("Flight Control");

        while (true) {
            System.out.println("""
                    
                    Choose an action:
                    [1] Print airplanes
                    [2] Print flights
                    [3] Print airplane details
                    [x] Quit""");
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equals("x")) {
                System.out.println("Exiting...");
                return;
            }
            handle(input);
        }
    }

    private void initAssetControlCommands() {
        commandMap.put("1", this::addAirplane);
        commandMap.put("2", this::addFlight);
    }

    private void initFlightControlCommands() {
        commandMap.put("1", this::printAirplanes);
        commandMap.put("2", this::printFlights);
        commandMap.put("3", this::printAirplaneDetails);
    }

    public void handle(String input) {
        commandMap.getOrDefault(input, this::unknownCommand).run();
    }

    private void addAirplane() {
        System.out.print("Give the airplane ID: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        flightControl.addAirplane(airplaneID, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane ID: ");
        String airplaneID = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String origin = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destination = scanner.nextLine();
        flightControl.addFlight(flightControl.getAirplane(airplaneID), origin, destination);
    }

    private void printAirplanes() {
        flightControl.getAirplanes().forEach(System.out::println);
    }

    private void printFlights() {
        flightControl.getFlights().forEach(System.out::println);
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane ID: ");
        String airplaneID = scanner.nextLine();
        System.out.println(flightControl.getAirplane(airplaneID));
    }

    private void unknownCommand() {
        System.out.println("Unknown command.");
    }
}
