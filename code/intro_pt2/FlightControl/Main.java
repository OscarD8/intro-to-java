package intro_pt2.FlightControl;

import intro_pt2.FlightControl.logic.FlightControl;
import intro_pt2.FlightControl.ui.CommandHandler;

import java.util.Scanner;

public class Main
{
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         FlightControl flightControl = new FlightControl();
         CommandHandler commandHandler = new CommandHandler(scanner, flightControl);

         commandHandler.start();
     }
}
