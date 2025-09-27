package intro_pt2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInputs = new ArrayList<>();

        while (true) {
            System.out.print("Input: ");
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            listInputs.add(input);
        }
        listInputs.stream()
                .filter(integer -> integer > 0)
                .filter(integer -> integer < 6)
                .forEach(System.out::println);
    }
}
