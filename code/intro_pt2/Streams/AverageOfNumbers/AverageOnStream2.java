package intro_pt2.Streams.AverageOfNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;



public class AverageOnStream2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();
            if (input.toLowerCase().trim().equals("end")) {
                System.out.print("Print the average of the negative numbers" +
                                    "or the positive numbers? (n/p): ");
                String selection = scanner.nextLine();
                System.out.println("Average of selection: " +
                                    averageOfSelected(inputs, selection));
                break;
            }

            inputs.add(input);
        }

        System.out.println(averages(inputs));
    }



    public static double averages(List<String> inputs) {
        double average = 0;

        try {
            average = inputs.stream()
                    .mapToInt((Integer::parseInt))
                    .average()
                    .orElse(0.0);
        } catch (Exception e) {
            System.out.println("Error processing value... skipping.");
        }

        return average;
    }

    public static double averageOfSelected(List<String> inputs, String selection) {
        IntPredicate filterCondition;
        double average = 0;

        if (selection.equals("n")) {
            filterCondition = number -> number <= 0;
        } else if (selection.equals("p")) {
            filterCondition = number -> number > 0;
        } else {
            return 0;
        }

        try {
            average = inputs.stream()
                    .mapToInt(Integer::parseInt)
                    .filter(filterCondition)
                    .average()
                    .orElse(0.0);
        } catch (Exception e) {
            System.out.println("Error processing value... skipping.");
        }

        return average;
    }
}
