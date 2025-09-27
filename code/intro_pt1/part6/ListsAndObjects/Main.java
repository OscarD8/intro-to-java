package intro_pt1.part6.ListsAndObjects;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        // Menu
        Menu myMenu = new Menu();
        myMenu.addMeal("Stew");
        myMenu.addMeal("Rice");
        myMenu.printMeals();

        myMenu.clearMenu();
        myMenu.addMeal("Tofu");
        myMenu.printMeals();
        System.out.println();

        // Stack
        Stack s = new Stack();
        s.addItem("1");
        s.addItem("2");
        s.addItem("3");
        s.addItem("4");
        s.addItem("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }

        // Messages
        Message mine = new Message();
        mine.feckoff();
        MessagingService service = new MessagingService();
        service.add(mine);
        ArrayList<Message> beans = service.getMessages();
        for (Message message : beans) {
            System.out.println(message);
            System.out.println(message.getMessage());
        }

        // Simple collection
        SimpleCollection mycoll = new SimpleCollection();
        mycoll.addItem("a");
        mycoll.addItem("b");
        mycoll.addItem("c");
        System.out.println(mycoll);

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book2 = new Gift("Harry Potter and the Cheese's Stone", 5);
        Package present = new Package();
        present.addGift(book);
        present.addGift(book2);

        System.out.println(book);
        System.out.println();
        System.out.println(present.totalWeight());

        SimpleCollection characters = new SimpleCollection();
        characters.addItem("CheeseISMEAT");
        characters.addItem("Hannibal");
        characters.addItem("BEEATCCH");
        System.out.println(characters.longest());
        System.out.println();

        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println();
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println();
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        Room newRoom = new Room();
        newRoom.add(new Person("Shaun", 700));
        newRoom.add(new Person("jum", 270));
        newRoom.add(new Person("Bill", 290));
        System.out.println();
        for (Person person : newRoom.getPersons()) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println(newRoom.take());
        System.out.println();
        for (Person person : newRoom.getPersons()) {
            System.out.println(person);
        }
    }

}
