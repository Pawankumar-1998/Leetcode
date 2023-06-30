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

        int[] arr = {-1,4,2,3};
        System.out.println(checkPossibility(arr));

    }

    static boolean checkPossibility(int[] nums){
        int n = nums.length;

        int ans = 0; // to store the difference between the bigger number in the middle and the last number
        int index = 0; // to store the index number at which the bigger number lies


        for (int i = 0; i <=n-2 ; i++) {
//            if this condition hits it means there is a number in between the array which violates the
//            the ascending order
            if (nums[i]>=nums[n-1]){
                index = i; // store the index
                ans = nums[i] - nums[n-1]; // difference between the largest number between and the last number
            }
        }

        nums[index] = ans; // place the difference at the index

//        checks if the array is in ascending order or not
        for (int i = 0; i < n-1 ; i++) {
            if (nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }

}
