package intro_pt2.Streams.Divisible;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DivisibleTwo
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        System.out.println(divisible(numbers));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(DivisibleTwo::divisableCheck)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static boolean divisableCheck(Integer num) {
        return num % 2 == 0 || num % 3 == 0 || num % 5 == 0;
    }
}
