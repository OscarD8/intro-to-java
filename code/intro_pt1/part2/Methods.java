package intro_pt1.part2;

import java.util.Scanner;



public class Methods
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        int num1 = getNums(reader);
//        int num2 = getNums(reader);
//        int num3 = getNums(reader);
//        int num4 = getNums(reader);
//
//        int numSum = sum(num1, num2, num3, num4);
//        double average = average(numSum, 4);
//
//        System.out.println("Average: " + average);

//        printRectangle(13, 3);
//        printTriangle(4);
//        System.out.println(" ");

        christmasTree(5);
        christmasTree(4);
        christmasTree(6);
    }


    public static int getNums(Scanner reader){
        System.out.print("Enter a number: ");
        return Integer.valueOf(reader.nextLine());
    }

    public static int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }


    public static double average(int sum, int numCount){
        return 1.00 * sum / numCount;
    }


    public static void printRectangle(int width, int height){
        int iteration = 1;

        while (iteration <= height){
            for (int i = 1; i <= width; i++){
                System.out.print("*");
            }
            System.out.println(" ");
            iteration++;
        }
    }


    public static void printTriangle(int size){
        int spaceCount = size - 1;
        int starCount = 1;

        for (int i = 1; i <= size; i++){
            printSpaces(spaceCount);
            printStar(starCount);
            System.out.println();

            spaceCount -= 1;
            starCount += 2;
        }
    }

    public static void printStar(int count) {
        System.out.print("*".repeat(count));
    }


    public static void printSpaces(int count) { System.out.print(" ".repeat(count)); }


    public static void christmasTree(int size) {
        printTriangle(size);

        for (int i = 1; i <= 2; i++){
            printSpaces(size - 2);
            printStar(3);
            System.out.println();
        }

        System.out.println();
    }
}
