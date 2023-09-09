package com.Pawan.Leetcode.Optimised;

public class MoorsVoting {
    public static void main(String[] args) {
            int[] arr =  {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] arr){
        int n = arr.length;
        int element = -1;
        int firstCount = 0;

        for (int i = 0; i < n; i++) {
            if (firstCount==0){
                element = arr[i];
                firstCount++;
            } else if (arr[i]==element){
                firstCount++;
            } else {
                firstCount--;
            }

        }

        int finalCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==element){
                finalCount++;
            }
        }

        if (finalCount>(n/2)){
            return element;
        }
        return -1;
    }
}
