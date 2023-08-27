package com.Pawan.TestField;

public class Leetcode_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
//        System.out.println(findDublicate(nums));
    }
    static void findDublicate(int[] nums){
        int n = nums.length;

    }
}


/**
 * this below code can also be used for the question but the time complexity is not good
 * as it need to traverse the array two times
 *
 *
 *
 * static int findDublicate(int[] nums){
 *         int n = nums.length;
 *
 *         for (int i= 0; i < n-1 ; i++) {
 *             for (int j = i+1; j < n; j++) {
 *                 if (nums[i]==nums[j]){
 *                     return nums[i];
 *                 }
 *             }
 *         }
 *         return -1;
 *     }
 */
