package code.part6.Grading;

import java.util.Scanner;

public class UserInterface
{
    Scanner scanner;
    GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister gradeRegiser) {
        this.scanner = scanner;
        this.register = gradeRegiser;
    }

    public void start() {
        readPoints();
        printGradeDistribution();
        System.out.println();
        printAverages();
        System.out.println();
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);

            if (stars > 0) {
                System.out.println();
                System.out.print("Grade " + grade + ": ");
            }

            while (stars > 0) {
                System.out.print("*");
                stars --;
            }

            grade --;
        }
    }

    public void printAverages() {
        System.out.println("Average grade: " + register.averageOfGrades());
        System.out.println("Average points: " + register.averageOfPoints());
    }

    public void readPoints(){
        while (true) {
            System.out.print("Enter points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int points = Integer.parseInt(input);
            if (points < 0 | points > 100) {
                System.out.println("Invalid point score.");
                continue;
            }
            this.register.addGradeBasedOnPoints(points);
        }
    }
}
