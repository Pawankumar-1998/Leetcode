package com.Pawan.Leetcode.BruteForce;

public class Leetcode_74 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {0,11,16,20},
                {23,30,34,60}
        };

        System.out.println(searchIn2DMatrix(arr,84));
    }

    static boolean searchIn2DMatrix(int[][] arr , int target){
        int arrayLength = arr.length;
        int columnLength = arr[0].length;

        for (int i = 0; i < arrayLength; i++) {
            if (target>=arr[i][0] && target<=arr[i][columnLength-1]){
               return binarySearch(arr[i],target);
            }
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]){
                return true;
            } else if (target<mid) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
}
