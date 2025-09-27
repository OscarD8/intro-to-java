package intro_pt2.Streams.AverageOfNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;


public class AverageOnStream
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();


        System.out.println("Input numbers - 'end' to stop");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        System.out.print("Averages of positives or negatives?: ");
        String condition = scanner.nextLine();
        System.out.println(averageOfSelected(inputs, condition));
    }



    public static double average(List<String> list) {

        double average = 0;

        try {
            average = list.stream()
                    .mapToInt(Integer::valueOf)
                    .average()
                    .getAsDouble();
        } catch (NumberFormatException e) {
            System.out.println("Issue with mapping value in list to integer.. skipping");
        }

        return average;
    }

    public static double averageOfSelected(List<String> list, String condition) {
        IntPredicate filterCondition;
        double average = 0;

        if (condition.equals("n")) {
            filterCondition = s -> s < 0;
        } else {
            filterCondition = s -> s > 0;
        }

        try {
            average = list.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(filterCondition)
                    .average()
                    .orElse(0);
        } catch (NumberFormatException e) {
            System.out.println("Issue with mapping value in list to integer.. skipping");
        }

        return average;
    }

    String a = "1";
    int anInt = Integer.parseInt(a);
    int anotherInt = Integer.valueOf(a);
}
