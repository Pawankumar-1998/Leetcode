package com.Pawan.GfG;

public class Largest_SubArray {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(largestSubArray(arr));
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
}
