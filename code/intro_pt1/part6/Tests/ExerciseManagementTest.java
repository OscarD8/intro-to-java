package intro_pt1.part6.Tests;

import intro_pt1.part6.ExamplesForTesting.ExerciseManagement;
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
        exerciseManagement.add("Yoga");
        assertTrue(exerciseManagement.containExercise("Yoga"));
    }

    @Test
    public void markExerciseAsComplete() {
        exerciseManagement.add("Yoga");
        exerciseManagement.markAsCompleted("Yoga");
        assertTrue(exerciseManagement.isCompleted("Yoga"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertFalse(exerciseManagement.isCompleted("Some exercise"));
    }
}
