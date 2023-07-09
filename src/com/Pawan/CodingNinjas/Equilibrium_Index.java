package com.Pawan.CodingNinjas;

public class Equilibrium_Index {
    public static void main(String[] args) {

    }
    static int findingIndex(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            int leftSum = 0;
            int rightSum = 0;

//            for finding the sum of all the left indices
            for (int j = 0; j < i ; j++) {
                leftSum+= arr[j];
            }
            
//            for finding the sum of all right indices 
            for (int k = i+1; k < n ; k++) {
                rightSum+= arr[k];
            }

            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }

}
