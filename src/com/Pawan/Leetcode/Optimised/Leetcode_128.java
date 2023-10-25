package com.Pawan.Leetcode.Optimised;

import java.util.HashSet;

public class Leetcode_128 {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(consecutiveNumber(arr));
    }
    static int consecutiveNumber(int[] arr){
        int n = arr.length;

//        if the array is empty return 0
        if (n==0){
            return 0;
        }
        int maxLength = 1;

//        using a hashset for the solution because hashset doesn't allow to store duplicate
        HashSet<Integer> uniqueBus = new HashSet<>();

//        adding all the elements to the hashset
        for (int i = 0; i < arr.length; i++) {
          uniqueBus.add(arr[i]);
        }

//        iteration over the set
        for (int currentItem : uniqueBus){
            /**
             * we need to first find the starting element it means finding a number that doesn't have it
             * a smaller number than it for example if 0 doesn't available in the set the immediate next
             * number will be considered as the starting number
             */
            if (!uniqueBus.contains(currentItem-1)){
//                if the above condition is hit means the currentNumber doesnt have any
//                smaller number that it which means it is the starting point to search
                int count = 1;
                int startFrom = currentItem;
//                if the current number contains the immediate next number
                while (uniqueBus.contains(startFrom+1)){
                    count += 1; // increase the count number by 1
                    startFrom = startFrom+1; // make the search from the next number
                }
                maxLength = Math.max(maxLength,count);
            }
        }
        return maxLength;
    }
}
