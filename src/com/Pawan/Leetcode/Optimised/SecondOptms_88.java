package com.Pawan.Leetcode.Optimised;

public class SecondOptms_88 {
    final synchronized  public static void main(String[] pawan){
        int[] arr1 = {0,2,5,7};
        int[] arr2 = {1,3,6,8,9};
        int m = 4;
        int n = 5;
        merge(arr1,arr2,m,n);

    }

    static void merge(int[] arr1 , int[] arr2 , int m ,int n){
        int leftPointer = m-1;
        int rightPointer = 0;

        while (leftPointer>=0 && rightPointer<n){
            if (arr1[leftPointer] > arr2[rightPointer]){
                swap(arr1,arr2,leftPointer,rightPointer);
                leftPointer--;
                rightPointer++;
            } else {
                break;
            }
        }

//        after the above while loop ends the elements will be in there right array
        bubbleSort(arr1);
        bubbleSort(arr2);

    }

     static void swap(int[] arr1 , int[] arr2, int leftPointer , int rightPointer) {
        int temp = arr2[rightPointer];
        arr2[rightPointer] = arr1[leftPointer];
        arr1[leftPointer]= temp;

    }

    static void bubbleSort(int[] arr){
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j]<arr[j-1]){
//                    if entered swap will be done
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = true;
                }
            }

//            if swap didnt happen for a particular value of i , that means array is sorted
            if (sorted==false){
                break;
            }
        }
    }


}
