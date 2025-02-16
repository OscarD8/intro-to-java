package code.part4.FilesAndReadingData;

import javax.xml.transform.Result;
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


        // Reading file and storing objects
//        Scanner userReader = new Scanner(System.in);
//        System.out.println("Filename: ");
//        String userInput = userReader.nextLine();
//        ArrayList<Person> personList = readRecordsFromFile(userInput);
//        for (Person person : personList) {
//            System.out.println(person);
//        }


        // Sports Statistics

        Scanner reader = new Scanner(System.in);
        System.out.print("File: ");
        String file = reader.nextLine();
        ArrayList<Results> resultRecords = readResults(file);

        if (resultRecords.size() > 1) {
            System.out.print("Team: ");
            String teamRequest = reader.nextLine();
            getGamesPlayed(resultRecords, teamRequest);
            getWinsAndLosses(resultRecords, teamRequest);
        }
    }



    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> personList = new ArrayList<>();

        try (Scanner reader = new Scanner(Path.of(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                personList.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return personList;
    }



    public static ArrayList<Results> readResults(String file) {
        ArrayList<Results> resultsList = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Path.of(file))) {
            while (fileReader.hasNextLine()) {
                String record = fileReader.nextLine();
                String[] recordParts = record.split(",");

                String homeTeam = recordParts[0];
                String awayTeam = recordParts[1];
                int homeScore = Integer.parseInt(recordParts[2]);
                int awayScore = Integer.parseInt(recordParts[3]);

                resultsList.add(new Results(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return resultsList;
    }


    public static void getGamesPlayed(ArrayList<Results> results, String teamCheck) {
        int count = 0;
        for (Results record : results) {
            if (record.checkNameBool(teamCheck)) {
                count++;
            }
        }
        System.out.println("Games: " + count);
    }

    public static void getWinsAndLosses(ArrayList<Results> results, String team) {
        int wins = 0;
        int losses = 0;

        for (Results result : results) {
            if (result.getAwayTeam().equals(team)) {
                if (result.getAwayTeamPoints() > result.getHomeTeamPoints()) {
                    wins++;
                }
                else losses++;
            }
            else if (result.getHomeTeam().equals(team)) {
                if (result.getHomeTeamPoints() > result.getAwayTeamPoints()) {
                    wins ++;
                }
                else losses ++;
            }
        }
        System.out.println("Wins: " + wins + "\n" +
                            "Losses: " + losses);
    }
}

