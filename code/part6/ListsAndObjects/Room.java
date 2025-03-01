package code.part6.ListsAndObjects;

import java.util.ArrayList;

public class Room
{
    ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }
    public Boolean isEmpty() {
        return this.persons.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person smallestPers = this.persons.getFirst();
        for (int i = 1; i < this.persons.size(); i++) {
            if (this.persons.get(i).getHeight() < smallestPers.getHeight()) {
                smallestPers = this.persons.get(i);
            }
        }
        return smallestPers;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person takenPerson = shortest();
        this.persons.remove(takenPerson);
        return takenPerson;
    }
}
