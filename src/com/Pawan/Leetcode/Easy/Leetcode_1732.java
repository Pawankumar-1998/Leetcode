package com.Pawan.Leetcode.Easy;

public class Leetcode_1732 {
    public static void main(String[] args) {


        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain){
        int n = gain.length;

        int presentAltitude = 0;
        int highest = 0;

        for (int i = 0; i <n; i++) {
            presentAltitude = presentAltitude + gain[i];
            if (presentAltitude>highest){
                highest = presentAltitude;
            }
        }
        return highest;
    }
}
