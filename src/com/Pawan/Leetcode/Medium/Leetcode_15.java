package com.Pawan.Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_15 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> myList = new ArrayList<>();

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                int waitNum = arr[i] + arr[j];
                for (int k = j+1; k < arr.length; k++) {
                    if (waitNum + arr[k]==0){
                        List<Integer> individualList = new ArrayList<>();
                        individualList.add(arr[i]);
                        individualList.add(arr[j]);
                        individualList.add(arr[k]);
                        myList.add(individualList);
                    }
                }
            }
        }
        return myList;
    }
}
