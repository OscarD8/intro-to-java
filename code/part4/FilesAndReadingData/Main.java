package code.part4.FilesAndReadingData;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        // Counting entries
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> userInputArray = new ArrayList<>();
//        System.out.println("Make entries: ");
//
//        while (true) {
//            String userInput = scanner.nextLine();
//            if (userInput.equals("end")) {
//                break;
//            }
//            userInputArray.add(userInput);
//        }
//        System.out.println(userInputArray.size());


        // working with string and in user input
//        Scanner intScan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        while (true) {
//            String stringInput = intScan.nextLine();
//            if (stringInput.equals("end")) {
//                break;
//            }
//            int intInput = Integer.parseInt(stringInput);
//            System.out.println(intInput * intInput * intInput);


        // checking a guest list
//        ArrayList<String> fileArray = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter file to open <file.txt> : ");
//        String userFile = scanner.nextLine();
//
//        try (Scanner filescan = new Scanner(Path.of(userFile))) {
//            while (filescan.hasNextLine()) {
//                String row = filescan.nextLine().trim();
//                fileArray.add(row);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        System.out.println();
//
//        System.out.println("Enter names (empty quits): ");
//        while (true) {
//            System.out.print(">");
//            String guestCheck = scanner.nextLine();
//
//            if (guestCheck.isEmpty()) {
//                break;
//            }
//            else if (fileArray.contains(guestCheck)) {
//                System.out.println("mucho gusto");
//            }
//            else {
//                System.out.println("NOMBRE NO FOUND MI PERRO :(");
//            }
//        }


        // checking ints within range
//        ArrayList<Integer> fileIntegers = new ArrayList<>();
//        Scanner stringReader = new Scanner(System.in);
//        System.out.print("Enter file name: ");
//        String userInput = stringReader.nextLine();
//        int count = 0;
//        int rowInt = 0;
//
//        try (Scanner fileReader = new Scanner(Path.of(userInput))) {
//            while (fileReader.hasNextLine()) {
//                try {
//                    rowInt = Integer.valueOf(fileReader.nextLine());
//                } catch (NumberFormatException e) {
//                    System.out.println("Error: " + e);
//                    continue;
//                }
//                fileIntegers.add(rowInt);
//            }
//        } catch (Exception e) {
//            System.out.println("Unable to open " + userInput);
//        }
//
//        System.out.print("Enter min range:  ");
//        int min = Integer.parseInt(stringReader.nextLine());
//        System.out.print("Enter max range: ");
//        int max = Integer.parseInt(stringReader.nextLine());
//
//        for (int number : fileIntegers) {
//            if (number >= min && number <= max) {
//                count += 1;
//            }
//        }
//        System.out.println("Numbers: " + count);


        // CSV style input with comma
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter file name: ");
//        String userRequest = scanner.nextLine();
//
//        try (Scanner fileReader = new Scanner(Path.of(userRequest))) {
//            while (fileReader.hasNextLine()) {
//                String line = fileReader.nextLine();
//                String[] parts = line.split(",");
//                System.out.println(parts[0] + ", age: " + parts[1] + "years");
//            }
//        } catch (Exception e) {
//            System.out.println("Error reading file.");
//        }


        //
    }
}

