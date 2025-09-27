package intro_pt2.Streams.WageOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Human ben = new Human("Bern", 500.00);
        Human shaun = new Human("Shaun", 10000);

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Tony", 2000000));
        humans.add(ben);
        humans.add(shaun);

        humans.stream()
                .forEach(System.out::println);
        System.out.println();

        Collections.sort(humans);
        humans.stream().forEach(System.out::println);
        System.out.println();


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kean"));
        students.add(new Student("Hannah"));
        students.add(new Student("Arthur"));

        students.stream().sorted();
        Collections.sort(students);
        students.stream().forEach(System.out::println);
    }
}
