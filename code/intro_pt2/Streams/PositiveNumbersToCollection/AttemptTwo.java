package intro_pt2.Streams.PositiveNumbersToCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AttemptTwo
{
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(-3);
        myList.add(9);

        List<Integer> positiveValues = positive(myList);
        System.out.println(positiveValues);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(AttemptTwo::isPositive)
                .collect(Collectors.toList());
    }

    public static boolean isPositive(Integer value) {
        return value > 0;
    }
}
