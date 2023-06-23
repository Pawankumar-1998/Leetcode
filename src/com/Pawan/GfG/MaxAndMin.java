package com.Pawan.GfG;

public class MaxAndMin {
    public static void main(String[] args) {

        /*
        Question link :- https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
        Input: arr = {1, 4, 3, -5, -4, 8, 6};
        Output: min = -5, max = 8

        Input: arr = {1, 4, 45, 6, 10, -8};
        Output: min = -8, max = 45
         */

        int[] arr = {1, 4, 45, 6, 10, -8};
        int lenght = arr.length;
        int ans = maxMin(arr,arr.length);
        System.out.println("the min element in the array is : "+ ans);
    }
    static int maxMin(int[] arr , int n){
//        base condition
        if (n==1){
            return arr[0];
        }

        return Math.min(arr[n-1],maxMin(arr,n-1));
    }

}
