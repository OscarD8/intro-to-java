package intro_pt2.Streams.PositiveNumbersToCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(-1);
        numbers.add(1);
        numbers.add(0);
        numbers.add(-10);

        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        try {
            return numbers.stream()
                    .filter(s -> s > 0)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("Issue with mapping.");
        }
        return new ArrayList<>();
    }
}
