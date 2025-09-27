package intro_pt2.ArraysAndHashMaps;

public class Sum
{
    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }


    public static int sum(int[] array, int start, int end, int minValue, int maxValue) {
        int sum = 0;

        start = Math.max(0, start); // we use Math to ensure that boundaries always come to the appropriate state without needing conditions
        end = Math.min(end, array.length);

        if (end == 0 || start >= end) return 0;

        for (int i = start; i < end; i++) {
            if (array[i] >= minValue || array[i] <= maxValue) {
                sum += array[i];
            }
        }

        return sum;
    }
}
