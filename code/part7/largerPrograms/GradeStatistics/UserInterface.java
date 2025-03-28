package part7.largerPrograms.GradeStatistics;

import java.util.Scanner;

public class UserInterface
{
    private Scanner scanner;
    private GradeStats gradeStats;

    public UserInterface(Scanner scanner, GradeStats gradeStats)
    {
        this.scanner = scanner;
        this.gradeStats = gradeStats;
    }


    public void start()
    {
        while (true)
        {
            System.out.print("Score: ");
            int score = Integer.parseInt(scanner.nextLine());

            if (score == -1) {
                break;
            } else if  (!(score >= 0 && score <= 100)) {
                System.out.println("Invalid score!");
            } else {
                gradeStats.add(score);
            }

        }

        System.out.println("Average: " + gradeStats.average());

        if (gradeStats.passingAverage() <= 0) {
            System.out.println("Passing average: -");
        } else {
            System.out.println("Passing average: " + gradeStats.passingAverage());
        }

        System.out.println("Pass Percentage: " + gradeStats.passPercentage() + "%");
        gradeStats.gradeDistribution();
    }

}
