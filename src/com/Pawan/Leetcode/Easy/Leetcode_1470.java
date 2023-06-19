package com.Pawan.Leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;

        System.out.println(Arrays.toString(shuffleArray(arr,n)));
    }

    static int[] shuffleArray(int[] arr , int n){
        int[] nums = new int[2*n];

        int j=0;
        int k=n;

//        for the even indices
        for (int i = 0; i < 2*n ; i=i+2) {
            nums[i] = arr[j++];
        }
//        for the odd indices
        for (int i = 1; i < 2*n ; i=i+2) {
            nums[i] = arr[k++];
        }
        return nums;
    }
}
