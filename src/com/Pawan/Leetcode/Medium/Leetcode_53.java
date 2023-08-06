package com.Pawan.Leetcode.Medium;
import java.lang.Math;

public class Leetcode_53 {
    public static void main(String[] args) {
        /*
        problem statement = https://leetcode.com/problems/maximum-subarray/
        Given an integer array nums, find the
        subarray
         with the largest sum, and return its sum.



        Example 1:

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.


         */


        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("the maximum element in the array is " + maxSubArray(arr));

    }

//    solving this using the time - complexity of O(n^3) not recommended generally
    static int maxSubArray(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];

//        taking three loops to iterate over the array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
//                this k loop used to traverse between the i and j
                for (int k = i; k <=j ; k++) {
                    currentSum = currentSum + arr[k];
                }
                maxSum = Math.max(maxSum,currentSum);
            }
        }
        return maxSum;
    }
}
