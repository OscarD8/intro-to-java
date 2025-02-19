package code.part5.EqualityWithLists;

import code.part5.OOPpart2.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        // Bird equality
        ArrayList<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird("Woodpecker"));
        birdList.add(new Bird("Finch"));
        Bird red = new Bird("Red");

        if (birdList.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }
        birdList.add(red);
        if (birdList.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }
        System.out.println("However!");
        red = new Bird("Red");
        if (birdList.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }


        // Book equality
//        Scanner reader = new Scanner(System.in);
//        ArrayList<Books> bookList = new ArrayList<>();
//
//        while (true) {
//            System.out.println("Name (empty will stop): ");
//            String bookName = reader.nextLine();
//            if (bookName.isEmpty()) {
//                break;
//            }
//            System.out.println("Publication year: ");
//            int year = Integer.parseInt(reader.nextLine());
//            Books bookInput = new Books(bookName, year);
//
//            int passes = 0;
//            for (Books book : bookList) {
//                if (book.equals(bookInput)) {
//                    System.out.println("Book already on list - lets not add.");
//                    break;
//                }
//                passes += 1;
//            }
//            if (passes == bookList.size()){
//                bookList.add(bookInput);
//            }
//        }
//        for (Books book : bookList) {
//            System.out.println(book);
//        }


        // Creating an archive
//        Scanner reader = new Scanner(System.in);
//        ArrayList<Item> itemList = new ArrayList<>();
//
//        while (true) {
//            System.out.println("Identifier (empty will stop): ");
//            String identifier = reader.nextLine();
//            if (identifier.isEmpty()) {
//                break;
//            }
//            System.out.println("Name (empty will exit): ");
//            String name = reader.nextLine();
//
//            if (name.isEmpty()) {
//                if (!(findStringInList(itemList, identifier))) {
//                    System.out.println("Please ensure a name is added for new identifier '"
//                            + identifier + "' (empty to cancel input): ");
//                    name = reader.nextLine();
//                    if (!name.isEmpty()) {
//                        itemList.add(new Item(name, identifier));
//                    }
//                }
//                break;
//            }
//
//            Item newItem = new Item(name, identifier);
//            if (!(doesListContain(itemList, newItem))) {
//                itemList.add(new Item(name, identifier));
//            }
//        }
//
//        output(itemList);

        // Counter
        Counter counter = new Counter();
        counter.increase();
        counter.increase();

        System.out.println(counter);         // prints 2

        Counter clone = counter.clone();

        System.out.println(counter);         // prints 2
        System.out.println(clone);          // prints 2

        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();

        System.out.println(counter);         // prints 6
        System.out.println(clone);          // prints 2

        clone.increase();

        System.out.println(counter);         // prints 6
        System.out.println(clone);          // prints 3
    }



    public static void output(ArrayList<Item> list){
        System.out.println("===Items===");
        for (Item item : list) {
            System.out.println(item);
        }
    }
    public static boolean findStringInList(ArrayList<Item> list, String comparer) {
        for (Item item : list){
            if (item.getIdentifier().equals(comparer)){
                return true;
            }
        }
        return false;
    }
    public static boolean doesListContain(ArrayList<Item> list, Item comparer) {
        for (Item item : list) {
            if (item.equals(comparer)) {
                return true;
            }
        }
        return false;
    }
}
