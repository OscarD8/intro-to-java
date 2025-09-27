package intro_pt2.Recap;

import java.util.Scanner;

public class Cube
{
    public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);


            while (true) {
                System.out.println("Enter Input: ");
                String userInput = input.nextLine().toLowerCase().trim();

                if (userInput.equals("exit")) {
                    break;
                }
                try {
                    int userNumber = Integer.parseInt(userInput);
                    System.out.println(userNumber * userNumber *  userNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number. " + e);
                }
            }
        }
}
