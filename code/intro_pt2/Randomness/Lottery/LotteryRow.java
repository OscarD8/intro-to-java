package intro_pt2.Randomness.Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow
{
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
         return numbers.stream()
                .anyMatch(num -> num == number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        Random random = new Random();
        this.numbers = new ArrayList<>();
        // Implement the randomization of the numbers by using the method containsNumber() here
        while (numbers.size() < 9) {
            int randomNum = random.nextInt(1,41);
            boolean listContains = containsNumber(randomNum);

            if (!listContains) {
                numbers.add(randomNum);
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}
