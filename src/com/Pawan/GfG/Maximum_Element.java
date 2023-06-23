package com.Pawan.GfG;

public class Maximum_Element {
    public static void main(String[] args) {
    /*
        Question link :- https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
        Input: arr = {1, 4, 3, -5, -4, 8, 6};
        Output: min = -5, max = 8

        Input: arr = {1, 4, 45, 6, 10, -8};
        Output: min = -8, max = 45
         */

        int[] nums = {1, 4, 3, -5, -4, 8, 6};

        int ans = maxElement(nums,0);
        System.out.println("The maximum element in the array is : " + ans);

    }
    static int maxElement(int[] arr , int n){
//        base condition
        if (n==6){
            return arr[6];
        }

//        recursive function
        return Math.max(arr[n],maxElement(arr,n+1));
    }
}
