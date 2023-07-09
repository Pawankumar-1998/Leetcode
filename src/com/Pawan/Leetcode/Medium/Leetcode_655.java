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
        Explanation: You could modify the first 4 to 1 to get a non-decreasing array that is ascending order .

         */

        int[] arr = {2,3,3,2,2};
        System.out.println(checkPossibility(arr));

    }

    static boolean checkPossibility(int[] nums){
        int n = nums.length;

        int position = -1; // Assume no index in the array disturbs the criteria of ascending order


        for (int i = 0; i < n-1 ; i++) {
//            if the current element is greater then the next element which violates the rules of ascending order
            if (nums[i]>nums[i+1]){
//                this will be true when you didn't find any index before which is disturbing the array so
//                just return false
                if (position!=-1){
                    return false;
                }
//                else just store the index the position
                position = i;
            }

        }

//      this condition will be true when there is no index which disturbes the array (i.e the given array -
//        is all ready sorted )
        if (position == -1) {
            return true;
        }

//        if the index is first index that need to be changed then return true , which means it is the
//        first index that is violating the rule so changing that index will give a ascending order array
//        because all the elements to the right is already sorted
        if (position == 0) {
            return true;
        }

//        if the index is second last index that need to be changed then return true , which means it is the
//        second last index that is violating the rule so changing that index will give a ascending order array
//        because all the elements to the left  is already sorted
        if (position == n - 2) {
            return true;
        }

//      if the previous index and the index before are in ascending order then by changing the
//        index will give you a ascending order array
        if (nums[position - 1] <= nums[position + 1]) {
            return true;
        }

//        if the index you are at and the index after 2 are at ascending order so the disturbing index is
//        index + 1 so by changing it you will get ascending array
        if (nums[position] <= nums[position + 2]) {
            return true;
        }
//        if there are two index that spoils the array then it will return false or else the
        else {
            return false;
        }
    }

}
