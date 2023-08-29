package com.Pawan.CodingNinjas.BruteForce;

import java.util.Arrays;

public class MissingRepeat {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,3};
        System.out.println(Arrays.toString(findMissingNumber(arr)));
    }
    static int[] findMissingNumber(int[] arr){
        int n = arr.length;
        int repeating = -1 , missing = -1;

        for (int i = 1; i <=n ; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j]==i) count++;
            }


            if (count==2){
                repeating = i;
            } else if (count==0) {
                missing = i;
            }

            if (repeating!=-1 && missing!=-1){
                break;
            }
        }
        int[] ans = {repeating,missing};
        return ans;
    }
}
