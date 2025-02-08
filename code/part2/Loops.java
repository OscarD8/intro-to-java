package code.part2;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        // Working with continue and break
//        while (true) {
//            System.out.print("Enter a positive number (0 to quit) :");
//            int num = Integer.valueOf(reader.nextLine());
//
//            if (num == 0) {
//                System.out.println("Exiting.");
//                break;
//            } else if (num < 0) {
//                System.out.println("Number must be positive.");
//                continue;
//            }
//
//            System.out.println(num * num);
//        }

        // calculating input sum and count
//        int inputCount = 0;
//        int inputSum = 0;
//
//        while (true) {
//            System.out.print("Enter a number (0 to quit): ");
//            int inputValue = Integer.valueOf(reader.nextLine());
//
//            if (inputValue == 0) {
//                break;
//            }
//
//            inputCount ++;
//            inputSum += inputValue;
//        }
//        System.out.println("Number of numbers: " + inputCount);
//        System.out.println("Sum of numbers: " + inputSum);

        int positiveValues = 0;
        int inputCount = 0;

        while (true) {
            System.out.print("Enter a num (0 to quit): ");
            int inputNum = Integer.valueOf(reader.nextLine());

            if (inputNum == 0) {
                if (positiveValues > 0){
                    System.out.println("Average of positive values: " + (float)(positiveValues / inputCount));
                } else {
                    System.out.println("No positive values - unable to calculate average.");
                }
                break;
            } else if (inputNum > 0) {
                positiveValues += inputNum;
                inputCount++;
            }
        }
    }
}
