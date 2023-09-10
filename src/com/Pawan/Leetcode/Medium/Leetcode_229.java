package com.Pawan.Leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_229 {
    public static void main(String[] args) {
            int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    static List<Integer> majorityElement(int[] arr){
        List<Integer> ansList = new ArrayList<>();
        int n = arr.length;

        int eligible = n/3;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n ; i++) {
                int value = map.getOrDefault(arr[i],0);
                map.put(arr[i],value+1);
        }

        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            if (it.getValue()>eligible){
                ansList.add(it.getKey());
            }
        }
        return ansList;
    }
}
