package intro_pt2.Streams.Divisible;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleThree
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);
        System.out.println(divisible);
    }

    public static ArrayList<Integer> divisible(List<Integer> numbers) {
        return numbers.stream()
                .filter(DivisibleThree::divisorCheck)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static boolean divisorCheck(int num) {
        return num % 2 == 0 | num % 3 == 0 | num % 5 == 0;
    }
}
