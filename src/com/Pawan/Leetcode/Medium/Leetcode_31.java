package com.Pawan.Leetcode.Medium;

import java.util.Arrays;

public class Leetcode_31 {
    public static void main(String[] args) {
    /*
    A permutation of an array of integers is an arrangement of its members into a
     sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations
of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
     */

        int[] arr = {5,4,7,5,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void nextPermutation(int[] nums){
        int breakingIndex = -1;
        int largerThanBreakingIndex = -1;


//        traversing the array from the backward to find the breaking point , breaking point is
//        the index where Nums[breakingIndex]<Nums[breakingIndex+1]

        for (int i = nums.length-2; i >=0 ; i--) {
                if (nums[i] < nums[i+1]){
                    breakingIndex = i;
                    break;
                }
        }

//          if the breaking point doesn't exist then it means the array is already sorted in descending
//          order so the next permutation is just to reverse the array 
        if (breakingIndex == -1){
            reverse(nums,0);


        } else {
//            if there is a breaking point
//            traverse the array to find the next largest element than the breaking index
            for (int i = nums.length-1; i >=0 ; i--) {
                if (nums[i] > nums[breakingIndex]){
                    largerThanBreakingIndex = i;
                    break;
                }
            }

//            swap the indexes
            swap(nums,breakingIndex,largerThanBreakingIndex);


//            then reverse the right half of the array
            reverse(nums,breakingIndex+1);
        }

    }

    static void reverse(int[] arr , int startIndex){
        int start = startIndex;
        int end = arr.length - 1;

        if (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}
