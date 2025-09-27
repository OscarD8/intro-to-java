package intro_pt2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        while (true) {
            System.out.println("Continue personal information input? 'quit'");
            System.out.println();

            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();

            if (firstName.equals("quit")) {
                break;
            }

            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Input the year of birth: ");
            int yoB = Integer.parseInt(scanner.nextLine());

            persons.add(new Person(firstName, lastName, yoB));
        }

        uniqueLastNames(persons);
    }

    public static void uniqueLastNames(List<Person> persons) {
        persons.stream()
                .map(Person::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
