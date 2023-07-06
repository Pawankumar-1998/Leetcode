package com.Pawan.Leetcode.Medium;

public class Leetcode_655 {
    public static void main(String[] args) {
        /*
        Problem Link :- https://leetcode.com/problems/non-decreasing-array/

        Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

        We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

        Example 1:

        Input: nums = [4,2,3]
        Output: true
        Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

         */

        int[] arr = {2,3,3,2,2};
        System.out.println(checkPossibility(arr));

    }

    static boolean checkPossibility(int[] nums){
        int n = nums.length;
        int count =0;
        int index = 0;

        int posibility = 0;

        for (int i = 0; i < n-1 ; i++) {
            if (nums[i]>nums[i+1]){
                count++;
            }
        }

        if (count==0){
            return true;
        } else if (count>1) {
            return false;
        } else {
            for (int i = 0; i < n-1 ; i++) {
                if (nums[i]>nums[i+1]){
                    index = i;
                    break;
                }
            }
            if (index==0){
                posibility = posibility + 1;
            }

            if (index==n-2) {
                posibility = posibility + 1;
            }

            if (nums[index-1]<=nums[index+1]) {
                posibility = posibility + 1;
            }

            if (nums[index]<=nums[n+2]){
                posibility = posibility + 1;
            }

            if (posibility==1){
                return true;
            } else {
                return false;
            }

        }

    }

}
