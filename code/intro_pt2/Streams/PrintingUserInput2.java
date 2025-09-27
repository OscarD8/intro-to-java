package intro_pt2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        inputs.stream()
                .forEach(System.out::println);
    }
}
