package intro_pt2.EnumsAndIterator.Education;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees
{
    List<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> personIterator = employees.iterator();

        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }

    public void print(Education education) {
//        employees.stream()
//                .filter(person -> person.getEducation().equals(education))
//                .forEach(System.out::println);

        Iterator<Person> personIterator = employees.iterator();

        while (personIterator.hasNext())
        {
            Person currentPerson = personIterator.next();
            if (currentPerson.getEducation().equals(education)) {
                System.out.println(currentPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> personIterator = employees.iterator();

        while(personIterator.hasNext()) {
            Person currentEmployee = personIterator.next();

            if (currentEmployee.getEducation().equals(education)) {
                personIterator.remove();
            }
        }
    }
}
