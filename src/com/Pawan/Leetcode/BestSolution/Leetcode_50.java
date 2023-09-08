package com.Pawan.Leetcode.BestSolution;

public class Leetcode_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,5));
    }
    static double myPow(int x , int n){
        double ans = 1;
        long power = n;

        if (power<0) power = power * -1;

        while (power>0){
            if (power%2==1){
                ans = ans * x;
                power = power -1;
            } else {
                x = x * x;
                power = power / 2;
            }
        }

        if (n<0){
            ans = (double)1/ (double)ans;
        }

        return ans;

    }
}
