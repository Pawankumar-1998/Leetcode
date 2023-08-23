package com.Pawan.Leetcode.Medium;

public class Leetcode_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDublicate(nums));
    }
    static int findDublicate(int[] arr){
    int lenghtOfTheArray = arr.length;

//    sort the array
        bubbleSort(arr);
        for (int i = 0; i < lenghtOfTheArray-1; i++) {
            if (arr[i]==arr[i+1])
                return arr[i];
        }
        return -1;
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
