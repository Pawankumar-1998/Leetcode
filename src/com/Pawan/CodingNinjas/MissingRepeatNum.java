package com.Pawan.CodingNinjas;

import java.util.Arrays;

public class MissingRepeatNum {
    public static void main(String[] args) {
//        Question Link :- https://www.codingninjas.com/studio/problems/873366?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1

        int[] arr = {3,1,2,5,3};
        System.out.println(Arrays.toString(findMissingAndRepeat(arr)));
    }

    static int[] findMissingAndRepeat(int[] arr){
        int n = arr.length;
        int[] duplicateArray = new int[n];
        int[] ansArray = new int[2];

        for (int i = 0; i < n ; i++) {
            int count = duplicateArray[arr[i]-1];
            duplicateArray[arr[i]-1] = count+1;
        }

        for (int i = 0; i < n ; i++) {
            if (duplicateArray[i]==2){
                ansArray[0] = i+1;
            } else if (duplicateArray[i]==0) {
                ansArray[1] = i+1;
            } else {

            }
        }
        return ansArray;
    }
}
