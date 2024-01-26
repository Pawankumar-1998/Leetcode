package com.Pawan.Exams.Matrix;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] sparseArr = {
                {4,0,0},
                {0,5,0},
                {0,0,6}
        };

        System.out.println(isASparseMatrix(sparseArr));
    }
    static boolean isASparseMatrix(int[][] arr){
        int rowLength = arr.length;
        int colLength = arr[0].length;
        int actualLength = rowLength * colLength;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==0){
                    zeroCount = zeroCount + 1;
                }
            }
        }
//        if the zero count is greater than the actual matrix length its a sparse matrix and return true
        if(zeroCount > (actualLength/2)){
            return true;
        } else {
            return false;
        }
    }
}
