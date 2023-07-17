package com.Pawan.Leetcode.Medium;

import java.util.Arrays;

public class Leetcode_73 {
    public static void main(String[] args) {


        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        setZero(matrix);
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    static void setZero(int[][] matrix){
        int rowSize = matrix.length; // number of rows
        int colsSize = matrix[0].length; // number of columns


        for (int i = 0; i < rowSize ; i++) {
            for (int j = 0; j <colsSize ; j++) {

                if (matrix[i][j]==0){
//                    code for changing the rows
                    changingRow(matrix,i);

//                    code for changing cols
                    changingCol(matrix,j);

                }
            }
        }

//
        for (int i = 0; i <rowSize ; i++) {
            for (int j = 0; j < colsSize; j++) {
                if (matrix[i][j]==-1){
                    matrix[i][j] = 0;
                }
            }
        }

    }

//    code for changing the row , dont set it to zero set it to -1 or any other negative number as
//    changing immediatly to zero doesn't give the required output because we again have to change all the zero
    static void changingRow(int[][] matrix ,int row){
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[row][i]!=0) {
                matrix[row][i] = -1;
            }
        }
    }


//    code for changing the coloumn
    static void changingCol(int[][] matrix , int cols){
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][cols]!=0) {
                matrix[i][cols] = -1;
            }
        }
    }
}
