package com.Pawan.TestField;
import java.util.ArrayList;
import java.util.List;

public class Leetcode_229 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,3,3,2,3,2,3,3};
        System.out.println(majorityElement(arr));


    }
    static List<Integer> majorityElement(int[] arr){
        int n = arr.length;
        int count1 = 0;
        int count2 = 0;

        int element1 = -1;
        int element2 = -2;

        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (count1==0 && arr[i]!=element2){
                element1 = arr[i];
                count1++;
            } else if (count2==0 && arr[i]!=element1){
                element2 = arr[i];
                count2++;
            } else if (arr[i]==element1) {
                count1++;
            } else if (arr[i]==element2) {
                count2++;
            } else {
                count1 --;
                count2 --;
            }
        }

        int firstMember = 0;
        int secondMember = 0;



        for (int i = 0; i < n; i++) {
            if (arr[i]==element1){
                firstMember++;
            }

            if (arr[i]==element2){
                secondMember++;
            }
        }
        if (firstMember>(n/3)){
            myList.add(element1);
        }

        if (secondMember>(n/3)){
            myList.add(element2);
        }

        return myList;
    }
}
