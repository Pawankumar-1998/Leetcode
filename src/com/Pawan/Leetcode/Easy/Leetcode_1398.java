package com.Pawan.Leetcode.Easy;

import java.util.Arrays;

public class Leetcode_1398 {
    public static void main(String[] args) {

        /*
        Example 1:

            Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
            Output: [0,4,1,3,2]
            Explanation:
            nums       index     target
            0            0        [0]
            1            1        [0,1]
            2            2        [0,1,2]
            3            2        [0,1,3,2]
            4            1        [0,4,1,3,2]
         */

        int[] arr = {0,1,2,3,4};
        int[] nums = {0,1,2,2,1};

        System.out.println(Arrays.toString(targetArray(arr,nums)));
    }

    static int[] targetArray(int[] arr , int[] nums){
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
           int index = nums[i];
           if (ans[index]==0){
               ans[index] = arr[i];
           } else {
               ans[index+1] = arr[index];
               ans[index] = arr[i];

           }
        }
        return ans;
    }
}
