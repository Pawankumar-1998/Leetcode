package com.Pawan.Leetcode.Optimised;

public class Leetcode_88 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,0,0,0};
        int[] num = {2,5,6};
        int m = 3;
        int n = 3;
        merge(arr,m,num,n);
    }

    static void merge(int[] arr1 , int m , int[] arr2 , int n){
         int leftPointer = 0;
         int rightPointer =0;
         int indexOfNewArray = 0;
         int[] newArray = new int[m+n];

       while (leftPointer < m && rightPointer < n){
           if (arr1[leftPointer] <= arr2[rightPointer]){
               newArray[indexOfNewArray] = arr1[leftPointer];
               leftPointer++;
               indexOfNewArray++;
           } else {
               newArray[indexOfNewArray] = arr2[rightPointer];
               rightPointer++;
               indexOfNewArray++;
           }
       }

//       if the left array get exhausted you need to insert the elements of the right array
        while (rightPointer<n){
            newArray[indexOfNewArray++] = arr2[rightPointer++];
        }

//        if the right array gets exhausted you will need to insert the elements of the left array
        while (leftPointer<m){
            newArray[indexOfNewArray++] = arr1[leftPointer++];
        }


//        after the above block of the code the elements in the new array gets sorted in the ascending order and after
//        this we need to put back the n number of elements in their place


        /**
         *
         *
//        inserting the elements back to the array 1 from the sorted array
        for (int i = 0; i < arr1.length ; i++){
            arr1[i] = newArray[i];
        }

//        inserting the elements back to the array 1 from the sorted array
        for (int i = 0; i < n; i++) {
            arr2[i] = newArray[m++];
        }
         *the above line of code is also applicable to return back the elements from the sorted array
         * the original array
         *
         * the below line of code is bit optimal because we are using only one for loop
         *
         */


        for (int i = 0; i < m+n; i++) {
           if (i<m){
               arr1[i] = newArray[i];
           } else {
               arr2[i-m] = newArray[i];
           }
        }

    }
}
