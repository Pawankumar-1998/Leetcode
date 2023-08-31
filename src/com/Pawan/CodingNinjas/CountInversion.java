package com.Pawan.CodingNinjas;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {1,20,6,4,5};
        int n = arr.length;
        System.out.println(countInversion(arr,n));
    }
    static int countInversion(int[] arr , int n){
        int count = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (i<j && arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
