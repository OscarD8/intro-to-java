package intro_pt1.part6.Grading;

import java.util.ArrayList;

public class GradeRegister
{
    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointToGrade(points));
    }

    public int pointToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            return grade;
        }
        else if (points < 60) {
            grade = 1;
        }
        else if (points < 70) {
            grade = 2;
        }
        else if (points < 80) {
            grade = 3;
        }
        else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count ++;
            }
        }
        return count;
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return (double) sum / this.points.size();
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
}
