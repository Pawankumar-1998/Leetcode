package com.Pawan.Leetcode.Optimised;

public class Leetcode_74 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {0,11,16,20},
                {23,30,34,60}
        };

        System.out.println(binarySearch(arr,64));
    }

    static boolean binarySearch(int[][] arr , int target){
        int start = 0;
        int end = ( arr.length * arr[0].length ) -1 ;

        while (start<=end){
            int mid = start + (end - start)/2;
            int row = mid / arr[0].length , col = mid % arr[0].length;

            if (arr[row][col] == target) {
                return true;
            } else if (target>arr[row][col]){
                start = mid + 1;
            } else {
                end = mid -1 ;
            }
        }
        return false;
    }
}
