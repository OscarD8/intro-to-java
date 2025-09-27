package intro_pt2.Recap;

import java.util.ArrayList;
import java.util.Scanner;


public class AveragePositives
{
    ArrayList<Integer> positives;

    public AveragePositives() {
        positives = new ArrayList<>();
    }


    public static void main(String[] args)
    {
        AveragePositives obj = new AveragePositives();
        obj.UI();
    }


    public void UI() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int userNumber = input.nextInt();

            if (userNumber ==  0) {
                calculateAverage();
                break;
            } else if (userNumber > 0) {
            positives.add(userNumber);
            }
        }
    }

    public void calculateAverage()
    {
        if (positives.isEmpty()) {
            System.out.println("No positive numbers entered");
        }
        else {
            int sum = 0;
            for (int number : positives) {
                sum += number;
            }

            System.out.println(sum /  positives.size());
        }
    }
}
