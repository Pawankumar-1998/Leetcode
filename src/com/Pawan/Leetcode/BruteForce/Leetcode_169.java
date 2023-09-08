package com.Pawan.Leetcode.BruteForce;

public class Leetcode_169 {
    public static void main(String[] args) {
        int[] arr = {6,6,6,7,7};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] arr){

        insertion(arr);
        int arrayLength = arr.length;


        int tempCount =0;
        int highestNumber = 0;

        int ans = arr[0];


            for (int i = 0; i < arrayLength-1; i++) {
                while (i<arrayLength-1 && arr[i] ==arr[i+1]){
                    tempCount++;
                    i++;
                }

                if (tempCount>highestNumber){
                    ans = arr[i];
                    highestNumber = tempCount;
                    tempCount = 0;
                }



        }
        return ans;
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
