package com.Pawan.Leetcode.Medium;

import java.util.Arrays;

public class Leetcode_48 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        rotateMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }

    static void rotateMatrix(int[][] arr){
        int n = arr.length;

//        flipping the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


//      swapping the index of the matrix
        for (int i = 0; i < n; i++) {
            int k = n-1;
            for (int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k]; 
                arr[i][k] = temp;
                k--;
            }
        }


    }
}
