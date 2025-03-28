package part3;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListIntro {
    public static void main(String[] args) {

        // returning an entered name
        ArrayList<String> list = new ArrayList<>();
        String input;
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name: ");
            input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }
            input = capitaliseWord(input);
            list.add(input);
        }

        System.out.println("Search: ");
        String search = reader.nextLine();
        search = capitaliseWord(search);

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found.");
        }

        removeLast(list);
        System.out.println(list);

//        System.out.print(getLastIndex(list));

        // Creating int list
//        ArrayList<Integer> intyBois = new ArrayList<>();
//        Scanner intReader = new Scanner(System.in);
//        int intInput;
//
//        while (true) {
//            System.out.println("Enter a number: ");
//            intInput = Integer.valueOf(intReader.nextLine());
//            if (intInput == -1) {
//                break;
//            }
//            intyBois.add(intInput);
//        }
//
//        // print the values of the list
//        System.out.println();
//        getIntIndexValues(intyBois);
//        System.out.println();
//
//        int sum = sumIntList(intyBois);
//        System.out.println("Sum: " + sum);
//        System.out.println();
//
//        double average = averageIntList(intyBois, sum);
//        System.out.println("Sum: " + average);
//        System.out.println();

        // identify index range
//        System.out.println("From where? ");
//        int start = Integer.valueOf(intReader.nextLine());
//        System.out.println("To where? ");
//        int end = Integer.valueOf(intReader.nextLine()) + 1;
//
//        System.out.println();
//        for (int i = start; i < end; i++){
//            System.out.println(intyBois.get(i));
//        }
//
//        // print greatest
//        System.out.println();
//        int greatest = getGreatestNum(intyBois);
//        System.out.println("The greatest number: " + greatest);
//
//        // Search for index of value
//        System.out.println();
//        System.out.println("Search for? ");
//        int reqValue = Integer.valueOf(intReader.nextLine());
//        getSpecificIndex(intyBois, reqValue);
//
//        // print smallest
//        System.out.println();
//        int smallest = getSmallestNum(intyBois);
//        System.out.println("The smallest number: " + smallest);
//        getSpecificIndex(intyBois, smallest);


        // Print numbers in range
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        printRange(numbers, 5, 6);
    }

        public static String capitaliseWord(String input) {
            String[] words = input.split("\\s");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                result.append(Character.toTitleCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }

            return result.toString().trim();
        }

        public static String getLastIndex (List < String > list) {
            int lastIndex = list.size() - 1;
            return list.get(lastIndex);
        }


        public static void getIntIndexValues (List < Integer > list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }


        public static int getGreatestNum(List <Integer> list){
            int greatest = list.get(0);
            for (int i = 1; i < list.size(); i++){
                if (list.get(i) > greatest)
                    greatest = list.get(i);
            }
            return greatest;
        }


        public static int getSmallestNum(List <Integer> list){
            int smallest = list.get(0);
            for (int i = 1; i < list.size(); i++){
                if (list.get(i) < smallest)
                    smallest = list.get(i);
            }
            return smallest;
        }


        public static void getSpecificIndex(List <Integer> list,  int reqValue){
            for (int i = 0; i < list.size(); i++){
                if (reqValue == list.get(i)){
                    System.out.println(reqValue + " is at index " + i);
                }
            }
        }


        public static int sumIntList(List <Integer> list){
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        }


        public static double averageIntList(List <Integer> list, int sum){
            int count = list.size();

            return (double) sum / count;
        }


        public static void printRange (ArrayList <Integer>  list, int lowLimit, int highLimit){
            for (int num : list){
                if (num >= lowLimit && num <= highLimit){
                    System.out.println(num);
                }
            }
        }


        public static void removeLast(ArrayList<String> list){

            if (list.size() == 0) {
                return;
            }

            int index = 0;
            for (String _ : list){
                if (index == list.size() - 1){
                    list.remove(index);
                    return;
                }
                index += 1;
            }
        }




}
