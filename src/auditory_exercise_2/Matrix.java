package auditory_exercise_2;

import java.util.Arrays;
import java.lang.reflect.Array;

public class Matrix {
    /*
    public static double sum(double[][] matrix) {
        double sum = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                sum += matrix[i][j];

        return sum;
    }
    */
    /*
    // with Java 8 Streams
    public static double sum(double[][] matrix) {
        return Arrays.stream(matrix).mapToDouble(row -> Arrays.stream(row).sum()).sum();
    }
    */
    public static double sum(double[][] matrix) {
        double sum = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                sum += element;
            }
        }

        return sum;
    }

    public static double average(double[][] matrix) {
        return sum(matrix) / (matrix.length * matrix[0].length);
    }

    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        System.out.println("The sum of the matrix is: " + sum(matrix));
        System.out.println("The average value of the matrix is: " + average(matrix));
    }
}
