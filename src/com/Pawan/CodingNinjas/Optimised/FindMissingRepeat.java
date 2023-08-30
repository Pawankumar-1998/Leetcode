package com.Pawan.CodingNinjas.Optimised;

import java.util.Arrays;

public class FindMissingRepeat {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,3};

        System.out.println(Arrays.toString(findMissingRepeat(arr)));
    }
    static int[] findMissingRepeat(int[] arr){
        int n = arr.length;
        int sumOfFirstN_NaturalNumber = (n * (n+1)) / 2;
        int squareSumOfFirstN_NaturalNumber = n*(n+1)*(2*n+1) / 6;

        int sumOfQuestionArray = 0 , squareSumOfQuestionArray = 0;

        for (int i = 0; i < n; i++) {
            sumOfQuestionArray += arr[i];

            squareSumOfQuestionArray += arr[i] * arr[i];
        }

        int firstExpression = sumOfQuestionArray - sumOfFirstN_NaturalNumber;

        int secondExpression = (squareSumOfQuestionArray - squareSumOfFirstN_NaturalNumber)/ firstExpression;

        int repeatingNumber = (firstExpression + secondExpression) / 2;

        int missingNumber = secondExpression - repeatingNumber;

        int[] ans = {repeatingNumber,missingNumber};

        return ans;
    }
}
