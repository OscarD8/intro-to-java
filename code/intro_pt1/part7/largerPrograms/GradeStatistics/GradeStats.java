package intro_pt1.part7.largerPrograms.GradeStatistics;


import intro_pt1.part3.ListIntro;
import java.util.ArrayList;


public class GradeStats
{
    private final ArrayList<Integer> grades;


    public GradeStats()
    {
        grades = new ArrayList<>();
    }


    public void add(int grade)  {
        grades.add(grade);
    }

    public int sum() {
        return ListIntro.sumIntList(grades);
    }

    public double average()
    {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = sum();
        return (double) sum / grades.size();
    }

    public double passingAverage() {
        int sum = 0;
        int count = 0;

        if (grades.isEmpty()) {
            return 0;
        }

        for (int  grade : grades) {
            if (grade >= 50) {
                sum += grade;
                count += 1;
            }
        }

        if (count == 0) {
            return 0;
        }
        return (double) sum / count;
    }

    public int totalPassingParticipants() {
        int count = 0;

        for (int  grade : grades) {
            if (grade >= 50) {
                count += 1;
            }
        }

        return count;
    }

    public double passPercentage() {
        int totalParticipants = grades.size();
        int totalPassingParticipants = totalPassingParticipants();

        return (double) (100 * totalPassingParticipants) / totalParticipants;
    }

    public void gradeDistribution()
    {
        int minBoundary = 90;
        int maxBoundary = 100;

        for (int i = 5; i >= 0; i--)
        {
            if (i == 0) {
                minBoundary = 0;
                maxBoundary = 50;
            }
            System.out.print(i + ": ");

            for (int grade : grades)
            {
                if (grade == 100 && maxBoundary == 100) {
                    System.out.print("*");
                }
                else if (grade >= minBoundary && grade < maxBoundary) {
                    System.out.print("*");
                }
            }
            maxBoundary -= 10;
            minBoundary -= 10;
            System.out.println();
        }
    }
}
