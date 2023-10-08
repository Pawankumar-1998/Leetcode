package com.Pawan.Leetcode.Optimised;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_15 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    static List<List<Integer>> threeSum(int[] arr){
//        sort the array
        Arrays.sort(arr);
        
//        list for storing the ans 
        List<List<Integer>> myList = new ArrayList<>();

        for (int leftPointer = 0; leftPointer < arr.length; leftPointer++) {
//            if the comparison for leftPointer is already made skip it
            if (leftPointer!=0 && arr[leftPointer]==arr[leftPointer-1]){
                continue;
            }

            int midPointer = leftPointer + 1;
            int rightPointer = arr.length-1;

//            if the midPointer and the right pointer crosses each other than we need to break the loop
            while (midPointer<rightPointer){
                int sum = arr[leftPointer] + arr[midPointer] + arr[rightPointer];

//                if the sum is less the 0 increase the midPointer for larger number
                if (sum<0){
                    midPointer++;
                } else if (sum>0) {
                    rightPointer--;
                } else {
//                  this condition will hit when the sum is zero
                    List<Integer> temp = Arrays.asList(arr[leftPointer],arr[midPointer],arr[rightPointer]);
//                    add the list to the ans list
                    myList.add(temp);
                    midPointer++;
                    rightPointer--;

//                    if the midPointer is pointing to the same element then skip it
                    while (midPointer<rightPointer && arr[midPointer] == arr[midPointer-1]){
                        midPointer++;
                    }

//                    if the rightPointer is pointing to the same element then skip it
                    while (midPointer<rightPointer && arr[rightPointer]==arr[rightPointer+1]){
                        rightPointer--;
                    }
                }
            }
        }

        return myList;

    }
}
