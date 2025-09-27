package intro_pt1.part7.largerPrograms.GradeStatistics;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GradeStats  gradeStats = new GradeStats();
        UserInterface userInterface = new UserInterface(sc, gradeStats);

        userInterface.start();
    }
}
