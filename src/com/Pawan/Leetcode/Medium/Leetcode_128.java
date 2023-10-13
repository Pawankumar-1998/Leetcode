package com.Pawan.Leetcode.Medium;

import java.util.Arrays;

public class Leetcode_128 {
    public static void main(String[] args) {

//        1 2 3 4 5
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(consecutiveNumber(nums));
    }
    static int consecutiveNumber(int[] arr){
        int max = 1;
        if (arr.length==0){
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i]; // 9 10
            int longestLength = 1;

            while (linearSearch(arr,currentNum+1)){
                longestLength = longestLength +1;
                currentNum = currentNum+1;
            }
            if (longestLength>max){
                max = longestLength;
            }

        }
        return max;
    }

    static boolean linearSearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
