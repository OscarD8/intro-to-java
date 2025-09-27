package intro_pt2.Streams.Literature;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCollection library = new BookCollection();
        UserInterface userInterface = new UserInterface(scanner, library);

        userInterface.start();
    }
}
