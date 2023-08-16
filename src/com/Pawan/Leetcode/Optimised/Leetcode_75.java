package com.Pawan.Leetcode.Optimised;

import java.util.Arrays;

public class Leetcode_75 {
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] arr){
        int n = arr.length;
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i]==0){
                col1++;
            } else if (arr[i]==1){
                col2++;
            }else {
                col3++;
            }
        }

        for (int i = 0; i < col1; i++) {
            arr[i] = 0;
        }

        for (int j = col1; j < col1+col2 ; j++) {
            arr[j] = 1;
        }

        for (int k = col1+col2; k < n ; k++) {
            arr[k] = 2;
        }
    }
}
