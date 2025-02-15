package code.part4.ObjectsInLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){

        // Retrieving products and timestamps
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Item> itemList = new ArrayList<>();
//        while (true) {
//            System.out.print("Name: ");
//            String item = scanner.nextLine();
//
//            if (item.isEmpty()) {
//                break;
//            }
//
//            Item newItem = new Item(item);
//            itemList.add(newItem);
//        }
//        for (Item item : itemList) {
//            System.out.println(item);
//        }


        // Personnel info collection
//        Scanner scanner2 = new Scanner(System.in);
//        ArrayList<PersonalInfomationCollection> personalInfo = new ArrayList<>();
//        while (true) {
//            System.out.println("First name: ");
//            String firstName = scanner2.nextLine();
//            if (firstName.isEmpty()){
//                break;
//            }
//
//            System.out.println("Last name: ");
//            String lastName = scanner2.nextLine();
//            personalInfo.add(new PersonalInfomationCollection(firstName, lastName));
//        }
//        for (PersonalInfomationCollection personnel : personalInfo) {
//            System.out.println(personnel);
//        }


        // TV program duration filter
//        Scanner reader3 = new Scanner(System.in);
//        ArrayList<TelevisionProgram> programmes = new ArrayList<>();
//        while (true) {
//            System.out.print("Name: ");
//            String pName = reader3.nextLine();
//            if (pName.isEmpty()) {
//                break;
//            }
//            System.out.print("Duration: ");
//            int duration = Integer.valueOf(reader3.nextLine());
//
//            programmes.add(new TelevisionProgram(pName, duration));
//        }
//        System.out.println("Enter a maximum duration: ");
//        int maxDuration = Integer.valueOf(reader3.nextLine());
//        for (TelevisionProgram program : programmes) {
//            if (program.getDuration() <= maxDuration) {
//                System.out.println(program);
//            }
//        System.out.println();
//        }


        // Book entries - optional returns
        Scanner reader4 = new Scanner(System.in);
        ArrayList<Book> bookArrayList = new ArrayList<>();

        System.out.println("Enter book entries below.");
        while (true) {
            System.out.print("Name: ");
            String bookName = reader4.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Number of pages: ");
            int noPages = Integer.parseInt(reader4.nextLine());
            System.out.print("Publication year: ");
            String publicationYear = reader4.nextLine();

            bookArrayList.add(new Book(bookName, noPages, publicationYear));
        }

        System.out.println();
        System.out.println("What information will be printed: ");
        String userInput = reader4.nextLine();

        for (Book book : bookArrayList) {
            if (userInput.equals("name")) {
                book.getBookName();
            } else if (userInput.equals("year")) {
                book.getPublicationYear();
            } else if (userInput.equals("page amount")) {
                book.getNoOfPages();
            } else if (userInput.equals("everything")) {
                System.out.println(book);
            } else {
                System.out.println("Exiting ");
            }
        }
    }
}
