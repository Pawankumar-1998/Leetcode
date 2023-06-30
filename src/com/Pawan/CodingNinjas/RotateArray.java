package com.Pawan.CodingNinjas;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = { 7,5 ,2,11 ,2, 43, 1, 1};
        int steps = 2; // means to rotate the array to left 2 times

        rotateTheArray(arr,steps);

    }
    static void rotateTheArray(int[] arr , int steps){
        int n = arr.length;


        // running the loop as much as shifts needed in this case 2
        for (int i = 0; i < steps ; i++) {
            int temp = arr[0]; // taking the first index value into the temp
            int j = 0;
            while (j<n-1){  // this while loop shifts all the values left
                arr[j] = arr[j+1];
                j++;
            }
            arr[n-1] = temp; // assign the temp value to the last index
        }

        System.out.println(Arrays.toString(arr));
    }


}
