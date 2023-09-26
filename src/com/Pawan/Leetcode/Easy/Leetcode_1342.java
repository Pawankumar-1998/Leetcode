package com.Pawan.Leetcode.Easy;

public class Leetcode_1342 {
    public static void main(String[] args) {

        /**
         * Problem statement link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
         */
            int ans = numberOfSteps(14);
        System.out.println("number of steps to get zero are : " + ans);

    }

    static int numberOfSteps (int n){
        if (n==0){
            return 0;
        }
        int count = 0;
        count = count + 1;

        if (n%2==0){
            return count + numberOfSteps(n/2);
        }

        return count + numberOfSteps(n-1);
    }

}
