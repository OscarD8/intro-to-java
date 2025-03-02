package code.part6.Tests;

import code.part6.ExamplesForTesting.ExerciseManagement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExerciseManagementTest
{
    private ExerciseManagement exerciseManagement;

    @BeforeEach
    public void initialize() {
        exerciseManagement = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        exerciseManagement.add("Write a test");
        assertEquals(1, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        exerciseManagement.add("Write an exercise");
        assertTrue(exerciseManagement.exerciseList().contains("Write an exercise"));
    }

    @Test
    public void markExerciseAsComplete() {
        exerciseManagement.add("Write an exercise");
        exerciseManagement.markAsCompleted("Write an exercise");
        assertTrue(exerciseManagement.isCompleted("Write an exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertFalse(exerciseManagement.isCompleted("Some exercise"));
    }
}