package com.Pawan.Leetcode.Optimised;

public class Leetcode_53 {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("the maximum element in the array is " + maxSubArray(arr));
    }

     static int maxSubArray(int[] arr) {
         int n = arr.length;
         int maxSum = arr[0];

         for (int i = 0; i < n; i++) {
             int currentSum = 0;
             for (int j = i; j < n ; j++) {
                 currentSum = currentSum + arr[j];
                 maxSum = Math.max(maxSum,currentSum);
             }
         }
         return maxSum;
    }
}
