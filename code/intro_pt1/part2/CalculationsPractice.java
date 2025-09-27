package intro_pt1.part2;

import java.util.Scanner;

public class CalculationsPractice
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        // square root and square
//        System.out.println("Enter a number: ");
//        int number = Integer.valueOf(reader.nextLine());
//        System.out.println("Enter another number: ");
//        int num2 = Integer.valueOf(reader.nextLine());
//        int result = number + num2;
//        double sqrt = Math.sqrt(result);
//        System.out.println(sqrt);

        // comparing values
        System.out.print("Enter an integer: ");
        int int1 = Integer.valueOf(reader.nextLine());
        System.out.print("Enter another integer: ");
        int int2 = Integer.valueOf(reader.nextLine());

        if (int1 > int2) {
            System.out.println(int1 + " is greater than " + int2);
        } else if (int1 < int2) {
            System.out.println(int1 + " is less than " + int2);
        } else {
            System.out.println(int1 + " and " + int2 + " are the same");
        }
    }
}
