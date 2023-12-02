package com.Pawan.Leetcode.Easy;

import java.util.Arrays;

public class Leetcode_1 {
    public static void main(String[] args) {

        /**
         * Problem Statement : https://leetcode.com/problems/two-sum/description/
         */

        int[] arr = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(sumPairs(arr,-8)));
    }

    static int[] sumPairs(int[] arr, int target){
        int[] ans = {-1,-1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

}
