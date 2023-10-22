package com.Pawan.Leetcode.Optimised;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_18 {
    public static void main(String[] args) {
        long[] arr = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(arr,-294967296));
    }
    static List<List<Long>> fourSum(long[] arr , long target){
        Arrays.sort(arr);

        List<List<Long>> myList = new ArrayList<>();

        for (int leftPointer = 0; leftPointer < arr.length - 3; leftPointer++) {
            if (leftPointer > 0 && arr[leftPointer] == arr[leftPointer - 1]) {
                continue;
            }
            for (int j = leftPointer + 1; j < arr.length - 2; j++) {
                if (j > leftPointer + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    long sum = arr[leftPointer] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Long> temp = Arrays.asList(arr[leftPointer], arr[j], arr[k], arr[l]);
                        myList.add(temp);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }

                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }
        return myList;

    }
}
