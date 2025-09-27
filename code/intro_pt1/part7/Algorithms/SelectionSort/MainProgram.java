package intro_pt1.part7.Algorithms.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainProgram
{
    public static void main(String[] args) {
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        String[] strarray = {"Beans", "Cheddar", "Ago", "Bro"};
        ArrayList<Integer> intybois = new ArrayList<>();
        intybois.add(10);
        intybois.add(5);
        intybois.add(2);
        intybois.add(20);
        ArrayList<String> stringbois = new ArrayList<>();
        stringbois.add("Bean");
        stringbois.add("Avacodan");
        stringbois.add("Carl");
//        System.out.println(smallest(array));
//        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
//        System.out.println(Arrays.toString(array));
//
//        MainProgram.swap(array, 1, 0);
//        System.out.println(Arrays.toString(array));
//        MainProgram.swap(array, 0, 3);
//        System.out.println(Arrays.toString(array));

        System.out.println();
//        selectionSort(array);
        sort(array);
        sort(strarray);
        sortIntegers(intybois);
        sortStrings(stringbois);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(strarray));
        System.out.println();
        for (int num : intybois) {
            System.out.println(num);
        }
        for (String string : stringbois) {
            System.out.println(string);
        }
    }

    public static int smallest(int[] array) {
        int min_index = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] < array[min_index]) {
                min_index = i + 1;
            }
        }

        return array[min_index];
    }

    public static int indexOfSmallest(int[] array) {
        int min_index = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] < array[min_index]) {
                min_index = i + 1;
            }
        }

        return min_index;
    }

    public static int indexOfSmallestFrom(int[] array, int index) {
        int min_index = index;

        for (int i = index; i < array.length-1; i++) {
            if (array[i + 1] < array[min_index]) {
                min_index = i + 1;
            }
        }

        return min_index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int placeHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = placeHolder;
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int min_index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            swap(array, min_index, i);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
