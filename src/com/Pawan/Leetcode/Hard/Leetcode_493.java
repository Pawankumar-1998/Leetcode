package com.Pawan.Leetcode.Hard;

public class Leetcode_493 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(reversePair(nums));
    }
    static int reversePair(int[] nums){
        int n = nums.length;
        int pairs = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]> 2 * nums[j]) pairs ++;
            }
        }
        return pairs;
    }
}
