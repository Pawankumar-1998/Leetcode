package com.Pawan.Leetcode.Easy;

public class Leetcode_1512 {
    public static void main(String[] args) {
        /*
        Given an array of integers nums, return the number of good pairs.
        A pair (i, j) is called good if nums[i] == nums[j] and i < j.

        Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
         */

        int[] nums = {1,2,3,1,1,3};
        System.out.println(goodPairs(nums));
    }
    static int goodPairs(int[] nums){
        int n = nums.length;
        int count = 0;

        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
