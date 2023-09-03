package com.Pawan.Leetcode.Medium;

public class Leetcode_74 {
    public static void main(String[] args) {
            int[][] arr = {
                    {1,3,5,7},
                    {0,11,16,20},
                    {23,30,34,60}
            };
        System.out.println(searchIn2DMatrix(arr,64));
        }

    static boolean searchIn2DMatrix(int[][] matrix , int target){
        int lengthOfTheRow = matrix.length;
        int lengthOfTheColumn = matrix[0].length;

        for (int i = 0; i < lengthOfTheRow; i++) {
            for (int j = 0; j < lengthOfTheColumn; j++) {
                if (target<=matrix[i][lengthOfTheColumn-1]){
//                    then do the search
                    for (int k = 0; k < lengthOfTheColumn; k++) {
                        if (matrix[i][k]==target){
                            return true;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }
}
