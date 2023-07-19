package com.Pawan.Leetcode.Optimised;

import java.util.Arrays;

public class Leetcode_73 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }
    }
    static void setMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[] rowArray = new int[n];
        int[] colArray = new int[m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j]==0){
                    rowArray[i] = 1;
                    colArray[j] = 1;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (rowArray[i] == 1 || colArray[j] == 1){
                    matrix[i][j] = 0;
                }
            }

        }
    }
}
