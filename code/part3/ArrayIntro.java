package code.part3;


import java.util.Scanner;

public class ArrayIntro
{
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 6;
        numbers[3] = -1;
        numbers[4] = 5;

        Scanner intReader = new Scanner(System.in);
            // swap numbers based on index
//        for (int i = 0; i < 2; i++){
//            System.out.println();
//
            for (int num : numbers){
                System.out.println(num);
            }
//
//            if (i == 0) {
//                System.out.println("Give two indexes to swap: ");
//                int a = Integer.valueOf(intReader.nextInt());
//                int b = Integer.valueOf(intReader.nextInt());
//
//                int holder = numbers[a];
//                numbers[a] = numbers[b];
//                numbers[b] = holder;
//            }

            // get a number - return the index
//        System.out.println("Search: ");
//        int numSearch = Integer.valueOf(intReader.nextInt());
//        int index = 0;
//        boolean found = false;
//
//        while (index < numbers.length) {
//            if (numbers[index] == numSearch){
//                System.out.println(numSearch + " found at index " + index + ".");
//                found = true;
//            }
//            index++;
//        }
//        if (!found) {
//            System.out.println("Unable to find number " + numSearch + ".");
//        }

        // sum
        int sum = sumOfNumbersInArray(numbers);
        System.out.println("Sum: " + sum);

        // print neatly
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

        // print row of stars by number
        System.out.println();
        int[] array2 = {5, 1, 3, 4, 2};
        printArrayInStars(array2);

    }


    public static int sumOfNumbersInArray(int[] array){
        int sum = 0;
        int index = 0;

        for (int num : array){
            sum += array[index];
        }

        return sum;
    }

    public static void printNeatly (int[] array){
        int index = 0;

        for (int num : array){
            System.out.print(num);
            if (index < array.length -1) {
                System.out.print(", ");
            }
            index ++;
        }
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        String star = "*";

        for (int num : array) {
            System.out.println(star.repeat(array[index]));
            index ++;
        }
    }
}

