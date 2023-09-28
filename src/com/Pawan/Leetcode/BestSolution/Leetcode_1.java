package com.Pawan.Leetcode.BestSolution;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_1 {
    public static void main(String[] args) {
//        2,7,11,15  target = 9
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] arr , int target){
        HashMap<Integer,Integer> bus = new HashMap<>();
        int[] ans = {-1,-1};

        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            int numberRequired = target - currentNumber;
            if (bus.containsKey(numberRequired)){
                ans[0] = bus.get(numberRequired);
                ans[1] = i;
                return ans;
            }
            bus.put(currentNumber,i);
        }
        return ans;
    }
}
