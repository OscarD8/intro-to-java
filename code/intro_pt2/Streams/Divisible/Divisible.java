package intro_pt2.Streams.Divisible;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);
        divisible.stream()
                .forEach(System.out::println);
    }


    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        // gathers numbers divisible by two, three, or five from list and returns as a new list
        try {
            return numbers.stream()
                    .filter(Divisible::divisors)
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println("Error innit");
        }
        return new ArrayList<>();
    }

    public static boolean divisors(Integer num) {
        return num % 2 == 0 || num % 3 == 0 || num % 5 == 0;
    }
}
