package intro_pt1.part1;

import java.util.Scanner;

public class Variables
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int firstInt = scanner.nextInt();
        System.out.println("Enter integer 2: ");
        int secondInt = scanner.nextInt();

        System.out.println("Average: " + ((float)(firstInt + secondInt) / 2));
        System.out.println("Sum: " + (firstInt + secondInt));
        System.out.println("Difference: " + (firstInt - secondInt));
        System.out.println("Quotient: " + (firstInt / secondInt));

        /*
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an int:");
        int inty = scanner.nextInt();
        System.out.println("Give a double:");
        double doub = scanner.nextDouble();
        System.out.println("Give a boolean:");
        boolean boo = scanner.nextBoolean();
        scanner.close();

         System.out.println("You gave the string: " + str);
         System.out.println("You gave the int: " + inty);
         System.out.println("You gave the double: " + doub);
         System.out.println("You gave the boolean: " + boo);
         */

//        System.out.println("Enter an integer: ");
//        int x = scanner.nextInt();
//        System.out.println("Enter another integer: ");
//        int y = scanner.nextInt();

//        System.out.println(x + " + " + y  + " = " + (x + y));



    }
}
