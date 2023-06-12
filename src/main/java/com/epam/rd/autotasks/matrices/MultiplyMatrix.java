package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

       int[][] res = new int[matrix1.length][matrix2.length];
        int i, j, k;
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix2.length; j++) {
                res[i][j] = 0;
                for (k = 0; k < matrix2.length; k++)
                    res[i][j] += matrix1[i][k]
                            * matrix2[k][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
