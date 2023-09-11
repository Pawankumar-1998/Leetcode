package com.Pawan.Leetcode.BruteForce;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_229 {
    public static void main(String[] args) {
            int[] arr = {3,2,2,2,3};
        System.out.println(majorityNumbers(arr));
    }
    static List<Integer> majorityNumbers(int[] arr){
        int n = arr.length;
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (myList.size()==0 || myList.get(0)!=arr[i]){
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i]==arr[j]){
                        count++;
                    }
                }
                if (count>(n/3)){
                    myList.add(arr[i]);
                }
            }
            if (myList.size()==2) break;
        }
        return myList;
    }
}
