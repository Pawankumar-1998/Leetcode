package com.Pawan.TestField;

public class Leetcode_50 {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2 ));
    }

    static double myPow(int x , int n){
        double ans = 1.0;
        long nn = n;
        if (nn < 0) nn = -1 * nn;
        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
    }
}
