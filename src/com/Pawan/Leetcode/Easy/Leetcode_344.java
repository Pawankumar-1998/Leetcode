package com.Pawan.Leetcode.Easy;

import java.util.Arrays;

public class Leetcode_344 {
    public static void main(String[] args) {
            char[] ans = {'h' , 'e' , 'l' , 'l' , 'o'};
            char[] p = ans;
            f(p,0, ans.length-1);
//        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans));
    }
    static void f(char[] arr , int start , int end){
        if (start>end){
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        f(arr,start+1,end-1);
    }
}
