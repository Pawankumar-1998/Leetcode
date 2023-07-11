package com.Pawan.CodingNinjas;

public class First_Missing_Positive {
    public static void main(String[] args) {
        /*
        Problem link :- https://www.codingninjas.com/studio/problems/first-missing-positive_699946?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube

         */

        int[] arr = {1};
        System.out.println("the missing positive integer is " + firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int element = nums[i];
            int correctIndex = element - 1;

            if (element>=1 && correctIndex < n) {
                if (nums[correctIndex] != element) {
                    int temp = nums[correctIndex];
                    nums[correctIndex] = element;
                    nums[i] = temp;
                    i--;
                }
            }
        }

        for (int i = 0; i < n ; i++) {
           if (nums[i] != i+1){
               return i + 1;
           }
        }
        return n;
    }
}
