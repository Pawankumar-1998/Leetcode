package com.Pawan.Leetcode.Medium;

public class Leetcode_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000,-2));
    }
    static double myPow(double x , int n){
        double ans = 1;
        long end = n;
        if(end<0){
            end = n * -1 ;
        }
    for (int i = 0; i < end ; i++) {
            ans = ans * x;

            }
        if (n<0){
            ans = 1 / ans;
        }
        return ans;
    }
}
