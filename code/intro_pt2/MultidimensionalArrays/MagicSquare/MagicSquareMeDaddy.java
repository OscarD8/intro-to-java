package intro_pt2.MultidimensionalArrays.MagicSquare;

import java.util.ArrayList;

public class MagicSquareMeDaddy
{
    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare();
        System.out.println(magicSquare.printSquare());
        System.out.println();
        ArrayList<Integer> sumMeRowsDaddy = magicSquare.sumOfRows();
        ArrayList<Integer> sumMeColumnsDaddy = magicSquare.sumOfColumns();
        sumMeRowsDaddy.forEach(System.out::println);
        System.out.println();
        sumMeColumnsDaddy.forEach(System.out::println);
        System.out.println();
        ArrayList<Integer> sumMeDiagonals = magicSquare.sumOfDiagonals();
        sumMeDiagonals.forEach(System.out::println);
    }
}
