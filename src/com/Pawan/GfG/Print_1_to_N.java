package com.Pawan.GfG;

public class Print_1_to_N {
    public static void main(String[] args) {

        /**
         * problem link : https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/0
         *
         * Print numbers from 1 to N without the help of loops.
         *
         * Example 1:
         *
         * Input:
         * N = 10
         * Output: 1 2 3 4 5 6 7 8 9 10
         */

        int N = 10;
        f(N);

    }
    static void f(int N){
        //Your code here
        if(N==0){
            return;
        }

        f(N-1);
        System.out.print(N + " ");
    }
}
