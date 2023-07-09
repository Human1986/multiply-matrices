package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(matrix1, matrix2, row, col);
            }
        }
        return result;
    }

    public static int multiplyMatricesCell(int[][] matrix1, int[][] matrix2, int row, int col) {
        int cell = 0;
        for (int i = 0; i < matrix2.length; i++) {
            cell += matrix1[row][i] * matrix2[i][col];
        }
        return cell;
    }
}
