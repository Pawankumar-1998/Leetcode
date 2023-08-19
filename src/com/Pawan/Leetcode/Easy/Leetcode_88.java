package com.Pawan.Leetcode.Easy;


public class Leetcode_88 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] num = {2,5,6};
        int m = 3;
        int n = 3;
        merge(arr,m,num,n);

    }
    static void merge(int[] arr , int m , int[] num , int n){
        int totalSize = m+n;
        for (int i = 0; i < n; i++) {
            arr[m] = num[i];
            m++;
        }

        for (int i = 0; i <totalSize-1 ; i++) {
            for (int j = 0; j < totalSize-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
}
