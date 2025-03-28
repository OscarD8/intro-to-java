package part1;

import java.util.Scanner;

public class ConditionalStatements
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter mark [0-100]: ");
//        int mark = scanner.nextInt();
//
//        if (mark > 100) {
//            System.out.println("incredible");
//        } else if (mark >= 90) {
//            System.out.println("5");
//        } else if (mark >= 80) {
//            System.out.println("4");
//        } else {
//            System.out.println("fail");
//        }

//        System.out.println("Enter an integer: ");
//        int oddOrEvenInt = scanner.nextInt();
//
//        if (oddOrEvenInt % 2 == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

//        System.out.println("Enter two strings: ");
//        String one = scanner.nextLine();
//        String two = scanner.nextLine();
//
//        if (one.equals(two)) {
//            System.out.println("Bingo");
//        } else if (one.equals("two strings") || two.equals("two strings")){
//            System.out.println("noice");
//        } else {
//            System.out.println("nada");
//        }

        // Leap Year test
//        System.out.println("Enter a year: ");
//        int year = scanner.nextInt();
//
//        if (year % 400 == 0) {
//            System.out.println("Leap Year as divisible by 400.");
//        } else if (year % 4 == 0 && year % 100 != 0) {
//            System.out.println("Leap Year condition 2.");
//        } else {
//            System.out.println("Not a leap year.");
//        }

        // Tax calculator
        System.out.println("Enter the value: ");
        int itemValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Now for the second string: ");
        String secondValue = scanner.nextLine();
        System.out.println(secondValue);

        if (itemValue < 5000) {
            System.out.println("No tax!");
        } else if (itemValue < 25000) {
            System.out.println("Tax: " + (100 + (itemValue - 5000) * 0.08));
        } else if (itemValue < 55000) {
            System.out.println("Tax: " + (1700 + (itemValue - 25000) * 0.10));
        } else if (itemValue < 200000) {
            System.out.println("Tax: " + (4700 + (itemValue - 55000) * 0.12));
        } else if (itemValue < 1000000) {
            System.out.println("Tax: " + (22100	 + (itemValue - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (itemValue - 1000000) * 0.10));
        }
    }
}
