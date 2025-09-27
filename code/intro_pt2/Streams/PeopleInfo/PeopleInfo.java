package intro_pt2.Streams.PeopleInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleInfo
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("Continue personal information input? 'quit' ends: ");

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Lastname: ");
            String lastName = scanner.nextLine();


            System.out.print("Year of birth: ");
            int yob = Integer.parseInt(scanner.nextLine());

            people.add(new Person(name, lastName, yob));
            System.out.println();
        }

        System.out.println();
        uniqueLastNames(people);
    }


    public static void uniqueLastNames(List<Person> persons) {
        persons.stream()
                .map(Person::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}

class Person {
    private String name;
    private String lastName;
    private int yob;

    public Person(String name, String lastName, int yob) {
        this.name = name;
        this.lastName = lastName;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYob() {
        return yob;
    }

    public String toString() {
        return name + ", " + lastName;
    }
}
