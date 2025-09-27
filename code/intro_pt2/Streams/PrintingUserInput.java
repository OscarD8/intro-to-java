package intro_pt2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listInputs = new ArrayList<>();

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            listInputs.add(input);
        }

        listInputs.stream()
                .forEach(System.out::println);
    }
}
