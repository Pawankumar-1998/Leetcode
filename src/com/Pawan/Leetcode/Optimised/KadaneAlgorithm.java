package com.Pawan.Leetcode.Optimised;

public class KadaneAlgorithm {
    public static void main(String[] args) {

        int[] arr = {-2,-1};
        System.out.println("the maximum element in the array is " + maxSubArray(arr));
    }

    static int maxSubArray(int[] arr){
        int n = arr.length;
        int maxSum = arr[0];

        if (n==1){
            return arr[n-1];
        }
//        performing a linear traversal
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum>maxSum){
                maxSum = sum;
            }
            if (sum<0){
                sum = 0;
            }


        }
        return maxSum;
    }
}
