package com.Pawan.TestField;

import java.util.*;

public class Leetcode_15 {
    public static void main(String[] args) {
        int[] ans = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(ans));
    }
     static List<List<Integer>> threeSum(int[] arr){
         Set <List<Integer>> mySet = new HashSet<>();

         for (int i = 0; i < arr.length-2; i++) {
             for (int j = i+1; j < arr.length-1 ; j++) {
                 int waitNum = arr[i] + arr[j];
                 for (int k = j+1; k < arr.length; k++) {
                     if (waitNum + arr[k]==0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        mySet.add(temp);
                     }
                 }
             }
         }

         List<List<Integer>> ans = new ArrayList<>(mySet);
         return ans;
     }
}
