package com.Pawan.GfG;

import java.util.HashMap;

public class Largest_SubArray {
    public static void main(String[] args) {
        int[] arr = {-1,1 ,-1 ,1};
//        System.out.println(largestSubArray(arr));
        System.out.println(largestSubArrayBT(arr,0));
    }
    static int largestSubArray(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int count = 0;
                for (int k = i; k <= j; k++) {
                    count++;
                    sum = sum + arr[k];
                }
                if (sum == 0 && count>max){
                    max = count;
                }
            }
        }
        return max;
    }

//    the code below will be the best solution
//    int arr = {15,-2,2,-8,1,7,10,23}

    static int largestSubArrayBT(int[] arr , int targetAmount){
        int maxLength = 0;
        int currentBalance = 0;

        HashMap<Integer,Integer> records = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentBalance = currentBalance + arr[i];

//            if the currentBalance is the targetAmount you are looking for then just count days ( length)
            if (currentBalance==targetAmount){
                maxLength = i + 1;
            } else
//                check if the same balance you had in the previous day records
                if(records.get(currentBalance)!= null){
                    maxLength = Math.max(maxLength,i-records.get(currentBalance));
                } else {
//                    if your current balance is not equal to the target amount and
//                    if you never had the same balance before then add the current balance to the
//                    record

                    records.put(currentBalance,i);
                }
        }
        return maxLength;
    }
}
