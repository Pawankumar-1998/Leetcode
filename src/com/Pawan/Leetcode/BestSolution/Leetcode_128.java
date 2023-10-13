package com.Pawan.Leetcode.BestSolution;

import java.util.Arrays;

public class Leetcode_128 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1};
        System.out.println(consecutiveSequence(arr));
    }
    static int consecutiveSequence(int[] arr){
//        sort the array
        Arrays.sort(arr); //0 1 1 2

        int lastSmallerNumber = Integer.MIN_VALUE;
        int maxLength = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1==lastSmallerNumber){
                lastSmallerNumber = arr[i];
                count = count + 1;
            } else if (arr[i]!=lastSmallerNumber){
                lastSmallerNumber = arr[i];
                count = 1;
            }
            if (count>maxLength){
                maxLength = count;
            }
        }
        return maxLength;
    }
}
