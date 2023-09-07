package com.Pawan.Leetcode.BruteForce;

public class Leetcode_169 {
    public static void main(String[] args) {
        int[] arr = {6,5,5};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] arr){
        int ans = arr[0];
        int greater = arr.length / 2;
        int tempCount = 0;

        for (int i = 0; i < arr.length-1; i++) {
                int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }

                if (count>greater){
                    ans = arr[i];
                }
            }
            tempCount = count;
        }
        return ans;
    }
}
