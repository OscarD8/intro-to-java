package intro_pt2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) {
                break;
            }
            inputs.add(input);
        }

        List<Integer> filteredInputs = filterInRange(inputs);
        printList(filteredInputs);
    }

    public static List<Integer> filterInRange(List<Integer> numbers) {
        return numbers.stream()
                .filter(LimitedNumbers2::filterCheck)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static boolean filterCheck(int number) {
        return number <= 5 & number >= 1;
    }

    public static void printList(List<Integer> list) {
        list.stream()
                .forEach(System.out::println);
    }
}
