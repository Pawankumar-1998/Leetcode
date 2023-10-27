package com.Pawan.Leetcode.Medium;

import java.util.*;

public class Leetcode_18 {
    public static void main(String[] args) {

        int[] arr = {2,2,2,2,2};
        System.out.println(fourSum(arr,8));
    }
    static List<List<Integer>> fourSum(int[] arr, int target){

        Set<List<Integer>> mySet = new HashSet<>();

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
                HashMap<Integer,Integer> bus = new HashMap<>();
                for (int k = j+1; k < arr.length ; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    int forthNumber = target - sum;
                    if (bus.containsKey(forthNumber)){
                        List<Integer> tempList = Arrays.asList(arr[i],arr[j],arr[k],forthNumber);
                        tempList.sort(null);
                        mySet.add(tempList);
                    }
                    bus.put(arr[k],k);
                } // end of k
            } // end of j
        } // end of i

        List<List<Integer>> ans = new ArrayList<>(mySet);
        return ans;
    } // end of fourSumFunction
}
