package com.Pawan.Leetcode.Hard;

public class Leetcode_41 {
    public static void main(String[] args) {
        /*
        problem link :- https://leetcode.com/problems/first-missing-positive/description/

        Given an unsorted integer array nums, return the smallest missing positive integer.

        You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

            Example 1:

            Input: nums = [1,2,0]
            Output: 3
            Explanation: The numbers in the range [1,2] are all in the array.
            Example 2:

            Input: nums = [3,4,-1,1]
            Output: 2
            Explanation: 1 is in the array but 2 is missing.
            Example 3:

            Input: nums = [7,8,9,11,12]
            Output: 1
            Explanation: The smallest positive integer 1 is missing.

         */

        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int element = nums[i];
            int correctIndex = element - 1;

            if (element>=1 && correctIndex < n) {
                if (nums[correctIndex] != element) {
                    int temp = nums[correctIndex];
                    nums[correctIndex] = element;
                    nums[i] = temp;
                    i--;
                }
            }
        }

        for (int i = 0; i < n ; i++) {
            if (nums[i] != i+1){
                return i + 1;
            }
        }
        return n+1;
    }
}
