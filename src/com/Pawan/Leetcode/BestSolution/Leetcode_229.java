package com.Pawan.Leetcode.BestSolution;

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
        int n = arr.length;

        Map<Integer,Integer> myMap = new HashMap<>();
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            int value = myMap.getOrDefault(arr[i],0);
            myMap.put(arr[i],value+1);

            int test = myMap.get(arr[i]);

            if (myMap.get(arr[i])==(n/3)+1){
                myList.add(arr[i]);
            }


            /**
            int maxValue = myMap.getOrDefault(arr[i],0);
            if (maxValue>(n/3) && myList.size()==0){
                myList.add(arr[i]);
            } else if (maxValue>(n/3)&& myList.get(0)!=arr[i]) {
                myList.add(arr[i]);
            }
             */

            if (myList.size()==2){
                break;
            }
        }

            return myList;

    }
}
