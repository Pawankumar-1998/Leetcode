package com.Pawan.Leetcode.Easy;

import java.util.Arrays;

public class Leetcode_832 {
    public static void main(String[] args) {
        /*
        Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

        To flip an image horizontally means that each row of the image is reversed.

        For example, flipping [1,1,0] horizontally results in [0,1,1].
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

        For example, inverting [0,1,1] results in [1,0,0].


        Example 1:

        Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        Output: [[1,0,0],[0,1,0],[1,1,1]]
        Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
        Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


         */

        int[][] arr = {
                {1,0,0,1,0,1},
                {0,0,1,0,1,1},
                {1,1,0,0,0,0},
                {1,0,0,1,1,0},
                {0,1,0,0,0,0},
                {1,0,1,1,0,0}

        };

        flippingImage(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static int[][] flippingImage(int[][] image){

        int length = image.length;

        for (int i = 0; i < length ; i++) {
            int n = image[i].length -1;
            for (int j = 0; j < image[i].length/2 ; j++) {
                if (image[i][j] != image[i][n]){
                    int temp = image[i][n];
                    image[i][n] = image[i][j];
                    image[i][j] = temp;
                }
                n --;
            }
        }

        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < image[i].length ; j++) {
                if (image[i][j] == 0){
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }

        }
        return image;
    }


}
