package code.part6.ExamplesForTesting;

import java.util.ArrayList;

public class ExerciseManagement
{
    private ArrayList<Exercise> exerciseList;

    public ExerciseManagement() {
        this.exerciseList = new ArrayList<>();
    }

    public ArrayList<Exercise> exerciseList() {
        return this.exerciseList;
    }

    public void add(String input) {
        this.exerciseList.add(new Exercise(input));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise entry : this.exerciseList) {
            if (exercise.equals(entry.getName())) {
                entry.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise) {
        for (Exercise entry : this.exerciseList) {
            if (exercise.equals(entry.getName())) {
                return entry.isCompleted();
            }
        }
        return false;
    }
}
