package com.Pawan.GfG;

import java.util.Arrays;

public class TriangleSum {
    public static void main(String[] args) {
        /**
         * question link : https://www.geeksforgeeks.org/sum-triangle-from-array/
         *
         * Input : A = {1, 2, 3, 4, 5}
         * Output : [48]
         *          [20, 28]
         *          [8, 12, 16]
         *          [3, 5, 7, 9]
         *          [1, 2, 3, 4, 5]
         *
         * Explanation :
         * Here,   [48]
         *         [20, 28] -->(20 + 28 = 48)
         *         [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
         *         [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
         *         [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
         */

        int[] arr = {1,2,3,4,5};
        rf(arr);
    }
    static void rf(int[] arr){
        if (arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] tempArray = new int[arr.length - 1];

        for (int i = 0; i < arr.length-1; i++) {
            int ans = arr[i] + arr[i+1];
            tempArray[i] = ans;
        }

        rf(tempArray);

        System.out.println(Arrays.toString(arr));

    }
}
