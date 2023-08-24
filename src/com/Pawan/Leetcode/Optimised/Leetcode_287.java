package com.Pawan.Leetcode.Optimised;

public class Leetcode_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(duplicateElement(nums));
    }
    static int duplicateElement(int[] arr){
        int n = arr.length;
        int[] resultArray = new int[n];

        for (int i = 0; i < n; i++) {
            if (resultArray[arr[i]]==0){
                resultArray[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return -1;
    }
}
