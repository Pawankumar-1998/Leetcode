package com.Pawan.Leetcode.BestSolution;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_169 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }

        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            if (it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}
