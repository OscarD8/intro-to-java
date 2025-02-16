package code.part5.OOPpart2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Book potter = new Book("JK Rowling", "Pottifer stone", 219);
        System.out.println(potter);

        Cube niceCube = new Cube(4);
        System.out.println(niceCube.volume());
        System.out.println(niceCube);


        Scanner reader = new Scanner(System.in);
        double percentage = 0.6;
        while (true) {
            System.out.println("Age (-1 to quit): ");
            int age = Integer.parseInt(reader.nextLine());
            if (age == -1) {
                break;
            }
            System.out.println("Resting HR: ");
            int restingHR = Integer.parseInt(reader.nextLine());
            Fitbyte assistant = new Fitbyte(age, restingHR);
            double targetPercentage = assistant.targetHeartRate(percentage);
            System.out.println("Target: " + (percentage * 100) + "% of maximum: " + targetPercentage);
            System.out.println();
        }

    }
}
