package com.Pawan.Leetcode.Optimised;

import java.util.Arrays;

public class DutchNF {
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        for (int i = 0; i < n; i++) {

            if (arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            } else if (arr[mid]==1){
                mid++;
            } else {
                swap(arr,mid,high);
                high--;
            }
        }

    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
