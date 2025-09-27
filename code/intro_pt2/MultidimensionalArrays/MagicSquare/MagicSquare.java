package intro_pt2.MultidimensionalArrays.MagicSquare;


import java.util.ArrayList;
import java.util.Random;

public class MagicSquare
{
    private int[][] matrix;

    public MagicSquare() {
        this.matrix = new int[3][3];
        fillMatrix();
    }


    private void fillMatrix() {
        for (int row = 0; row < this.matrix.length; row++) {
            for (int column = 0; column < this.matrix.length; column++) {
                this.matrix[row][column] = generateRandomNumber();
            }
        }
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 10);
    }

    public ArrayList<Integer> sumOfRows(){
        ArrayList<Integer> sumOfRows = new ArrayList<>();

        for (int row = 0; row < this.matrix.length; row++) {
            int sumOfRow = 0;

            for (int column = 0; column < this.matrix[row].length; column++) {
                sumOfRow += this.matrix[row][column];
            }
            sumOfRows.add(sumOfRow);
        }

        return sumOfRows;
    }

    public ArrayList<Integer> sumOfColumns() {
        ArrayList<Integer> sumOfColumns = new ArrayList<>();

        for(int column = 0; column < matrix.length; column++) {
            int columnSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                columnSum += this.matrix[row][column];
            }
            sumOfColumns.add(columnSum);
        }

        return sumOfColumns;
    }

    public ArrayList<Integer> sumOfDiagonals() {
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        sumOfDiagonals.add(sumPrimaryDiagonal());
        sumOfDiagonals.add(sumSecondaryDiagonal());
        return sumOfDiagonals;
    }

    private int sumPrimaryDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private int sumSecondaryDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }


        public String printSquare() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int row = 0; row < this.matrix.length; row++) {
            for (int column = 0; column < this.matrix[row].length; column++) {
                stringBuilder.append(this.matrix[row][column]);
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString().trim();
    }
}
