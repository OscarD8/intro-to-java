package part2;

import java.util.Scanner;

public class MoreLoops
{
    public static void main(String[] args) {
        // intro to for loops
        Scanner reader = new Scanner(System.in);

//        System.out.print("Where to: ");
//        int end = Integer.valueOf(reader.nextLine());
//        System.out.print("Where from: ");
//        int start = Integer.valueOf(reader.nextLine());
//
//        for (int i = start; i <= end; i++) {
//            System.out.println(i);
//        }

            // Sum of interval values
//        System.out.print("Enter a max number: ");
//        int maxNum = Integer.valueOf(reader.nextLine());
//        System.out.print("Enter a min number: ");
//        int minNum = Integer.valueOf(reader.nextLine());
//        int sum = 0;
//
//        for (int i = minNum; i <= maxNum; i++) {
//            sum += i;
//        }
//
//        System.out.println(sum);

            // Factorial calculation
//        System.out.print("Enter a number: ");
//        int val = Integer.valueOf(reader.nextLine());
//        int result = 1;
//
//        for (int i = 2; i <= val; i++) {
//           result *= i;
//        }
//        System.out.print(result);

        int sumx = 0;
        int countx = 0;
        int evenCountx = 0;
        int oddCountx = 0;

        while (true){
            System.out.print("Enter a number (-1 to stop): ");
            int numberx = Integer.valueOf(reader.nextLine());

            if (numberx == -1) {
                break;
            }

            if (numberx % 2 == 0) {
                evenCountx += 1;
            } else {
                oddCountx += 1;
            }

            sumx += numberx;
            countx += 1;
        }
        System.out.println("Sum: " + sumx);
        System.out.println("Numbers: " + countx);
        System.out.println("Average: " + (1.0  * sumx / countx));
        System.out.println("Even: " + evenCountx);
        System.out.println("Odd: " + oddCountx);
        System.out.println("Thx! Bye!");
    }
}
