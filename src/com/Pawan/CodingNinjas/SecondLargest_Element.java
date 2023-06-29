package com.Pawan.CodingNinjas;

public class SecondLargest_Element {
    public static void main(String[] args) {
        /*
        Question link :- https://www.codingninjas.com/studio/problems/second-largest-element-in-the-array_873375?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube

        input array :-
         */


        int[] arr = { 2, 6, -10, -40, -25, -12, -25, -10, 5 ,-12, -10, -10, -6, -5 };
        int n = arr.length;
        System.out.println(secondLargest_Element(arr,n));

    }

    static int secondLargest_Element(int [] arr , int n){
        int max = 0;

        for (int i = 0; i < n ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }

//        after the completion of the above loop we will get the maximum number in the array

//        finding the difference between the maximum number and the element
//        any element having the less difference from the maximum number is the second largest element
        int min = max - arr[0];
        int ans = -1 ;
        for (int i = 1; i < n ; i++) {
            if (arr[i]!=max && max - arr[i] < min){
                ans = arr[i];
            }
        }

        return ans;
    }
}
