package com.Pawan.Leetcode.BestSolution;

import java.util.*;

public class Leetcode_15 {
    public static void main(String[] args) {
//            Input: nums = [-1,0,1,2,-1,-4]

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    static List<List<Integer>> threeSum(int[] arr){

        Set<List<Integer>> mySet = new HashSet<>();

        for (int i = 0; i < arr.length-1; i++) {
            HashMap<Integer,Integer> myBus = new HashMap<>();
            for (int j = i+1; j < arr.length ; j++) {
                    int sum = arr[i] + arr[j];
                    int requiredSum = 0 - sum;
                    if (myBus.containsKey(requiredSum)){
                        List<Integer> temp = Arrays.asList(arr[i] , arr[j] , requiredSum);
                        temp.sort(null);
                        mySet.add(temp);
                    }
                   myBus.put(arr[j],j);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(mySet);
        return ans;
    }
}
