package intro_pt2.Randomness.Numbers;

import java.util.Random;
import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Numbers letsGo = new Numbers(scanner, random);
        letsGo.go();
    }


    private Scanner scanner;
    private Random random;

    public Numbers(Scanner scanner, Random random) {
        this.scanner = scanner;
        this.random = random;
    }

    public void go() {
        System.out.print("How many numbers: ");
        int iterations = scanner.nextInt();

        for (int i = 0; i < iterations; i++) {
            System.out.println(random.nextInt(11));
        }
    }
}
