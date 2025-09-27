package intro_pt1.part6.Grading;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scanner, register);
        userInterface.start();
    }
}
